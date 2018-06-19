/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modle;

/**
 *
 * @author RM.LasanthaRanga@gmail.com
 */
public class GetInstans {

    private static modle.UserCategory userCategory;
    private static modle.Department department;
   
    /**
     * @return the userCategory
     */
    public static modle.UserCategory getUserCategory() {
        if (userCategory == null) {
            userCategory = new UserCategory();
        }
        return userCategory;
    }

    /**
     * @return the department
     */
    public static modle.Department getDepartment() {
        if(department==null){department = new Department();}
        return department;
    }

    

}
