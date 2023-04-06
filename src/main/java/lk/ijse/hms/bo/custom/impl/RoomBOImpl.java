package lk.ijse.hms.bo.custom.impl;

import lk.ijse.hms.bo.custom.RoomBO;
import lk.ijse.hms.bo.util.Convertor;
import lk.ijse.hms.dao.DaoFactory;
import lk.ijse.hms.dao.DaoTypes;
import lk.ijse.hms.dao.custom.QueryDAO;
import lk.ijse.hms.dao.custom.ReservationDAO;
import lk.ijse.hms.dao.custom.RoomDAO;
import lk.ijse.hms.dto.CustomDTO;
import lk.ijse.hms.dto.RoomDTO;
import lk.ijse.hms.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

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
    private final QueryDAO queryDAO = DaoFactory.getInstance().getDAO(DaoTypes.QUERY);
    private final ReservationDAO reservationDAO = DaoFactory.getInstance().getDAO(DaoTypes.RESERVATION);
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

    @Override
    public List<CustomDTO> getAllUnPaidReservation() {
        Session session = FactoryConfiguration.getInstance().getSession();
        try {
            return queryDAO.findAllUnPaidReservation(session).stream().map(custom -> convertor.fromCustom(custom)).collect(Collectors.toList());
        }finally {
            session.close();
        }
    }

    @Override
    public boolean payReservationByReservationId(String reservationId, CustomDTO.Status status) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try {
            if (reservationDAO.updateStatusByPk(reservationId, status, session)) {
                transaction.commit();
                return true;
            }
            throw new Exception();
        }catch (Exception e){
            transaction.rollback();
            return false;
        }finally {
            session.close();
        }
    }
}
