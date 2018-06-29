/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modle;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author RM.LasanthaRanga@gmail.com
 */
public class Process {

    public void getProcessData(int mailInfoId) {
        Session session = conn.NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction().commit();
        try {
            
            List<pojo.Proces> list = session.createCriteria(pojo.Proces.class).add(Restrictions.eq("mailinfo", session.load(pojo.Mailinfo.class, mailInfoId))).list();
            
            
            
            
            
            
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
        
        }
        
        
        
        

    }

}

