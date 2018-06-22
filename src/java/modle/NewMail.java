package modle;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import pojo.Mailinfo;

/**
 *
 * @author RM.LasanthaRanga@gmail.com
 */
public class NewMail {

    public boolean saveNewMail(int mailcat, String sender, String institute, Date r, Date l, String title, String myno, int pages, int uid) {
        Session session = conn.NewHibernateUtil.getSessionFactory().openSession();
        Transaction beginTransaction = session.beginTransaction();
        try {
            Mailinfo mi = new Mailinfo();
            mi.setMailInfoSender(sender);
            mi.setMailInfoTitle(title);
            mi.setMailInfoInstitute(institute);
            mi.setMailInfoReceivedDate(r);
            mi.setMailInfoDateOfLatter(l);
            mi.setMailInfoMyNo(myno);
            mi.setMailInfoPageCount(pages);
            pojo.Mailcatagory mc = (pojo.Mailcatagory)session.load(pojo.Mailcatagory.class, mailcat);
            mi.setMailcatagory(mc);
            mi.setMailstatus((pojo.Mailstatus) session.load(pojo.Mailstatus.class, 1));
            mi.setUser((pojo.User) session.load(pojo.User.class, uid));
            session.save(mi);
            beginTransaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            beginTransaction.rollback();
            return false;
        } finally {
            session.close();
        }

    }

}
