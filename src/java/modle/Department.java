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

/**
 *
 * @author RM.LasanthaRanga@gmail.com
 */
public class Department {

    public HashMap<Integer, String> getDepartmentList() {
        Session session = conn.NewHibernateUtil.getSessionFactory().openSession();
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

}
