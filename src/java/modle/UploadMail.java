/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modle;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Attachmant;
import pojo.Mailinfo;

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

}
