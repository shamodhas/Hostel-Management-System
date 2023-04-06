package lk.ijse.hms.bo.custom.impl;

import lk.ijse.hms.bo.custom.LoginBO;
import lk.ijse.hms.bo.exception.NotFoundException;
import lk.ijse.hms.bo.util.Convertor;
import lk.ijse.hms.dao.DaoFactory;
import lk.ijse.hms.dao.DaoTypes;
import lk.ijse.hms.dao.custom.UserDAO;
import lk.ijse.hms.dto.UserDTO;
import lk.ijse.hms.entity.User;
import lk.ijse.hms.util.FactoryConfiguration;
import org.hibernate.Session;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/6/2023
 * Time :1:58 PM
 */

public class LoginBOImpl implements LoginBO {
    private final UserDAO userDAO = DaoFactory.getInstance().getDAO(DaoTypes.USER);
    private final Convertor convertor = new Convertor();
    @Override
    public UserDTO verifyUser(UserDTO userDTO) throws NotFoundException {
        Session session = FactoryConfiguration.getInstance().getSession();
        Optional<User> optional = userDAO.findByUserNamePassword(userDTO.getUserName(), userDTO.getPassword(), session);
        session.close();
        if (optional.isPresent()){
            return convertor.fromUser(optional.get());
        }
        throw new NotFoundException("user name or password is wrong ..!");
    }

    @Override
    public List<UserDTO> getAllUser() {
        Session session = FactoryConfiguration.getInstance().getSession();
        try {
            return userDAO.findAll(session).stream().map(user -> convertor.fromUser(user)).collect(Collectors.toList());
        }finally {
            session.close();
        }
    }

    @Override
    public List<UserDTO> searchUserByText(String text) {
        Session session = FactoryConfiguration.getInstance().getSession();
        try {
            return userDAO.search(text, session).stream().map(user -> convertor.fromUser(user)).collect(Collectors.toList());
        }finally {
            session.close();
        }
    }
}
