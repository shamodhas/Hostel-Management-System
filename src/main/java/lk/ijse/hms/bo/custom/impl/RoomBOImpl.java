package lk.ijse.hms.bo.custom.impl;

import lk.ijse.hms.bo.custom.RoomBO;
import lk.ijse.hms.bo.util.Convertor;
import lk.ijse.hms.dao.DaoFactory;
import lk.ijse.hms.dao.DaoTypes;
import lk.ijse.hms.dao.custom.RoomDAO;
import lk.ijse.hms.dto.RoomDTO;
import lk.ijse.hms.util.FactoryConfiguration;
import org.hibernate.Session;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/6/2023
 * Time :1:58 PM
 */

public class RoomBOImpl implements RoomBO {
    private final Convertor convertor = new Convertor();
    private final RoomDAO roomDAO = DaoFactory.getInstance().getDAO(DaoTypes.ROOM);
    @Override
    public List<RoomDTO> getAllRoom() {
        Session session = FactoryConfiguration.getInstance().getSession();
        try {
            return roomDAO.findAll(session).stream().map(room -> convertor.fromRoom(room)).collect(Collectors.toList());
        }finally {
            session.close();
        }
    }

    @Override
    public List<RoomDTO> searchMembersByText(String text) {
        Session session = FactoryConfiguration.getInstance().getSession();
        try {
            return roomDAO.search(text, session).stream().map(room -> convertor.fromRoom(room)).collect(Collectors.toList());
        }finally {
            session.close();
        }
    }
}
