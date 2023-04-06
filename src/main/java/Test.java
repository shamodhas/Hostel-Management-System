import lk.ijse.hms.entity.User;
import lk.ijse.hms.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/6/2023
 * Time :1:05 AM
 */

public class Test {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(new User("U001", null, null, null, null, null));
        transaction.commit();
    }
}
