import lk.ijse.hms.dao.DaoFactory;
import lk.ijse.hms.dao.DaoTypes;
import lk.ijse.hms.dao.SuperDAO;
import lk.ijse.hms.dao.custom.UserDAO;
import lk.ijse.hms.entity.User;
import lk.ijse.hms.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/6/2023
 * Time :12:24 AM
 */

public class Tester {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        User user = new User();
        user.setUserName("s");

        Query query = session.createQuery("FROM User WHERE userName= :u AND password =:p");
        query.setParameter("u", "s");
        query.setParameter("p", "1");
        List<User> list = query.list();
        System.out.println(list.get(0).getUserId());


//        Transaction transaction = session.beginTransaction();
//        UserDAO userDAO = DaoFactory.getInstance().getDAO(DaoTypes.USER);
//        if (userDAO.getLastPk( session).isPresent()){
//
//            System.out.println(userDAO.getLastPk( session).get());
//        }else {
//            System.out.println("no 6");
//        }
//        if (userDAO.getLastPk(  session).isPresent()){
//            System.out.println(userDAO.getLastPk( session).get());
//        }else {
//            System.out.println("no 7");
//        }


//        for (User user1 : userDAO.findAll(session)){
//            System.out.println(user1.getUserId());
//
//        }

//        userDAO.save(user,session);
//        try {
//            transaction.commit();
//        }catch (Exception e){
//            System.out.println("fail");
//        }
//        System.out.println("ok");
//        session.close();
    }
}
