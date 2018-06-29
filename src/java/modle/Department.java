/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modle;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.hibernate.Criteria;
import org.hibernate.Session;
import pojo.User;
import pojo.Userhasdepartment;

/**
 *
 * @author RM.LasanthaRanga@gmail.com
 */
public class Department {

    public HashMap<Integer, String> getDepartmentList() {
        Session session = conn.NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction().commit();
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        try {
            Criteria criteria = session.createCriteria(pojo.Department.class);
            List<pojo.Department> list = criteria.list();
            for (pojo.Department department : list) {
                hm.put(department.getIdDepartment(), department.getDepartmentName());
            }
            return hm;            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }

    }
    
    
     public String getDepOfLogUser(int luid) {
         String dip ="";
        Session session = conn.NewHibernateUtil.getSessionFactory().openSession();
        try {
            User user = (pojo.User)session.load(pojo.User.class, luid);
            Set<Userhasdepartment> userhasdepartments = user.getUserhasdepartments();
            for (Userhasdepartment userhasdepartment : userhasdepartments) {
                dip = userhasdepartment.getDepartment().getDepartmentName();
            }
           return dip;
        } catch (Exception e) {
            e.printStackTrace();
            return dip;
        } finally {
            session.close();
        }

    }
    
    
    

}
