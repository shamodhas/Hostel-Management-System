import lk.ijse.hms.entity.User;
import lk.ijse.hms.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/6/2023
 * Time :12:24 AM
 */

public class Tester {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
//        Transaction transaction = session.beginTransaction();
//
//        User user = new User("U001", "shamodha", null, null, null, null);
//        session.save(user);
//        transaction.commit();
//        session.close();
    }
}
