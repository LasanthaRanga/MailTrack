package modle;

import java.util.HashMap;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author RM.LasanthaRanga@gmail.com
 */
public class MailCatagory {

    public HashMap<Integer, String> getCatagoryList() {
        HashMap<Integer, String> hm = new HashMap<>();
        Session session = conn.NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction().commit();
        try {
            List<pojo.Mailcatagory> list = session.createCriteria(pojo.Mailcatagory.class).list();
            for (pojo.Mailcatagory mc : list) {
                hm.put(mc.getIdMailCatagory(), mc.getMailCatagoryCatagory());
            }
            return hm;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }
}
