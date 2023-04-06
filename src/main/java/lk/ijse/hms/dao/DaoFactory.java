package lk.ijse.hms.dao;

import lk.ijse.hms.dao.custom.ReservationDAO;
import lk.ijse.hms.dao.custom.impl.*;
import org.hibernate.Session;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/6/2023
 * Time :9:16 AM
 */

public class DaoFactory {
    private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getInstance(){
        return daoFactory == null?
                daoFactory = new DaoFactory():daoFactory;
    }

    public <T extends SuperDAO>T getDAO(Session session, DaoTypes daoTypes){
        switch (daoTypes){
            case RESERVATION:
                return (T) new ReservationDAOImpl(session);
            case STUDENT:
                return (T) new StudentDAOImpl(session);
            case ROOM:
                return (T) new RoomDAOImpl(session);
            case USER:
                return (T) new UserDAOImpl(session);
            case QUERY:
                return (T) new QueryDAOImpl(session);
            default:
                return null;
        }
    }
}
