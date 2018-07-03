/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modle;

import java.util.HashMap;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import pojo.Proces;
import pojo.User;

/**
 *
 * @author RM.LasanthaRanga@gmail.com
 */
public class MailList {

    public HashMap<Integer, pojo.Mailinfo> getRecivedList(int uid) {

        Session session = conn.NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction().commit();
        HashMap<Integer, pojo.Mailinfo> hm = new HashMap<Integer, pojo.Mailinfo>();
        try {
            int mailStatus = 0;
            User user = (pojo.User) session.load(pojo.User.class, uid);
            Integer idUserCatagory = user.getUsercatagory().getIdUserCatagory();
            if (idUserCatagory == 4) {
                mailStatus = 3;
            }
            if (idUserCatagory == 5) {
                mailStatus = 4;
            }

            Criteria criteria = session.createCriteria(pojo.Proces.class);
            criteria.add(Restrictions.eq("userByUserTo", user));
            criteria.add(Restrictions.eq("mailstatus", session.load(pojo.Mailstatus.class, mailStatus)));
            List<pojo.Proces> list = criteria.list();
            for (Proces proces : list) {
                if (proces.getProcesStatus() == 1) {
                    hm.put(proces.getMailinfo().getIdMailInfo(), proces.getMailinfo());
                }
            }
            return hm;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }

    }

    public int getRecivedCount(int uid) {
        int x = 0;

        return x = 0;
    }

}
