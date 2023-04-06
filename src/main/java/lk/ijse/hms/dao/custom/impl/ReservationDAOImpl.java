package lk.ijse.hms.dao.custom.impl;

import lk.ijse.hms.dao.custom.ReservationDAO;
import lk.ijse.hms.entity.Reservation;
import org.hibernate.Session;

import java.util.List;
import java.util.Optional;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/6/2023
 * Time :9:23 AM
 */

public class ReservationDAOImpl implements ReservationDAO {
    public ReservationDAOImpl(Session session) {

    }

    @Override
    public boolean save(Reservation entity) {
        return false;
    }

    @Override
    public boolean update(Reservation entity) {
        return false;
    }

    @Override
    public boolean deleteByPk(String pk) {
        return false;
    }

    @Override
    public List<Reservation> findAll() {
        return null;
    }

    @Override
    public Optional<Reservation> findByPk(String pk) {
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
