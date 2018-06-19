/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.jasper.tagplugins.jstl.ForEach;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author RM.LasanthaRanga@gmail.com
 */
public class UserCategory {

    public HashMap<Integer, String> getUserCatList() {
        Session session = conn.NewHibernateUtil.getSessionFactory().openSession();
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        try {
            Criteria criteria = session.createCriteria(pojo.Usercatagory.class);
            List<pojo.Usercatagory> list = criteria.list();
            for (pojo.Usercatagory c : list) {
                hm.put(c.getIdUserCatagory(), c.getUserCatagoryName());
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
