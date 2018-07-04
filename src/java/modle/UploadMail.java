/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modle;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.tuple.entity.NonPojoInstrumentationMetadata;
import pojo.Attachmant;
import pojo.Attachmantbyofficer;
import pojo.Mailinfo;
import pojo.Proces;
import pojo.User;

/**
 *
 * @author RM.LasanthaRanga@gmail.com
 */
public class UploadMail {

    public boolean uploadInfo(String path, int pageNo, int LatterNo) {
        Session session = conn.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            Mailinfo mailinfo = (pojo.Mailinfo) session.load(pojo.Mailinfo.class, LatterNo);
            Attachmant attachmant = new pojo.Attachmant();
            attachmant.setMailinfo(mailinfo);
            attachmant.setAttachmantNumber(pageNo);
            attachmant.setAttachmantPath(path);
            session.save(attachmant);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }

    }

    public boolean uploadAttach(String path, int latterNo, int UserId, int attachNo, String title) {
        Session session = conn.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            Mailinfo mi = (pojo.Mailinfo) session.load(pojo.Mailinfo.class, latterNo);
            User user = (pojo.User)session.load(pojo.User.class, UserId);
            
            Criteria criteria = session.createCriteria(pojo.Proces.class);
            criteria.add(Restrictions.eq("mailinfo", mi));
            criteria.add(Restrictions.eq("userByUserTo", user));
            criteria.add(Restrictions.eq("procesStatus", 1));
            List<pojo.Proces> list = criteria.list();
            Proces proces = list.get(0);
            
            Attachmantbyofficer atach  = new pojo.Attachmantbyofficer();
            atach.setUser(user);
            atach.setProces(proces);
            atach.setMailinfo(mi);
            atach.setAttachmantByOfficerTitle(title);
            atach.setAttachmantByOfficerNumber(attachNo);
            atach.setAttachmantByOfficerPath(path);
            
            session.save(atach);
            transaction.commit();
            return true;
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }

    }

}
