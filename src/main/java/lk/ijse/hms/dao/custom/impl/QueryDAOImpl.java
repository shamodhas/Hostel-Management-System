package lk.ijse.hms.dao.custom.impl;

import lk.ijse.hms.dao.custom.QueryDAO;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/6/2023
 * Time :9:23 AM
 */

public class QueryDAOImpl implements QueryDAO {

    @Override
    public List<Object[]> findAllUnPaidReservation(Session session) {
        Query query = session.createQuery("SELECT re.resId,s.studentId,s.name,ro.roomTypeId,ro.type,ro.keyMoney,re.status,re.date FROM Reservation re JOIN Student s ON re.student = s.studentId JOIN Room ro ON re.room =ro.roomTypeId WHERE re.status = :status");
        return query.setParameter("status", "UNPAID").list();
    }
}
