package pojo;
// Generated Jul 10, 2018 4:31:37 AM by Hibernate Tools 4.3.1



/**
 * Userhasdepartment generated by hbm2java
 */
public class Userhasdepartment  implements java.io.Serializable {


     private Integer idUserHasDepartment;
     private Department department;
     private User user;

    public Userhasdepartment() {
    }

    public Userhasdepartment(Department department, User user) {
       this.department = department;
       this.user = user;
    }
   
    public Integer getIdUserHasDepartment() {
        return this.idUserHasDepartment;
    }
    
    public void setIdUserHasDepartment(Integer idUserHasDepartment) {
        this.idUserHasDepartment = idUserHasDepartment;
    }
    public Department getDepartment() {
        return this.department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }




}


