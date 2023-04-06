package lk.ijse.hms.dao.custom.impl;

import lk.ijse.hms.dao.custom.UserDAO;
import lk.ijse.hms.entity.User;
import lk.ijse.hms.util.FactoryConfiguration;
import org.hibernate.Session;

import java.util.List;
import java.util.Optional;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/6/2023
 * Time :9:24 AM
 */

public class UserDAOImpl implements UserDAO {
    private final Session session;
    public UserDAOImpl(Session session) {
        this.session = session;
    }

    @Override
    public boolean save(User entity) {
        try {
            session.save(entity);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean update(User entity) {
        try {
            session.update(entity);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean deleteByPk(String pk) {
        try {
            session.delete(session.load(User.class, pk));
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public Optional<User> findByPk(String pk) {
        return Optional.empty();
    }

    @Override
    public Optional<String> getLastPk() {
        return Optional.empty();
    }

    @Override
    public long count() {
        return 0;
    }
}
