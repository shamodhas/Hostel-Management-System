package lk.ijse.hms.dao.custom.impl;

import lk.ijse.hms.dao.custom.RoomDAO;
import lk.ijse.hms.entity.Room;
import org.hibernate.Session;

import java.util.List;
import java.util.Optional;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/6/2023
 * Time :9:23 AM
 */

public class RoomDAOImpl implements RoomDAO {
    public RoomDAOImpl(Session session) {

    }

    @Override
    public boolean save(Room entity) {
        return false;
    }

    @Override
    public boolean update(Room entity) {
        return false;
    }

    @Override
    public boolean deleteByPk(String pk) {
        return false;
    }

    @Override
    public List<Room> findAll() {
        return null;
    }

    @Override
    public Optional<Room> findByPk(String pk) {
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
