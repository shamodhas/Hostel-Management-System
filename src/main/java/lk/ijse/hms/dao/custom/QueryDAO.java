package lk.ijse.hms.dao.custom;

import lk.ijse.hms.dao.SuperDAO;
import org.hibernate.Session;

import java.util.List;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/6/2023
 * Time :9:25 AM
 */

public interface QueryDAO extends SuperDAO {
    List<Object[]> findAllUnPaidReservation(Session session);
}
