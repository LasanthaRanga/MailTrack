package pojo;
// Generated Jun 19, 2018 11:31:05 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private Integer idUser;
     private Usercatagory usercatagory;
     private String userFullName;
     private String userDesignation;
     private String userEmail;
     private String userPassword;
     private String userMobile;
     private String userNic;
     private Integer userStatus;
     private String userImagePath;
     private String userVerify;
     private Set<Attachmantbyofficer> attachmantbyofficers = new HashSet<Attachmantbyofficer>(0);
     private Set<Proces> procesesForUserFrom = new HashSet<Proces>(0);
     private Set<Proces> procesesForUserTo = new HashSet<Proces>(0);
     private Set<Userhasdepartment> userhasdepartments = new HashSet<Userhasdepartment>(0);

    public User() {
    }

	
    public User(Usercatagory usercatagory) {
        this.usercatagory = usercatagory;
    }
    public User(Usercatagory usercatagory, String userFullName, String userDesignation, String userEmail, String userPassword, String userMobile, String userNic, Integer userStatus, String userImagePath, String userVerify, Set<Attachmantbyofficer> attachmantbyofficers, Set<Proces> procesesForUserFrom, Set<Proces> procesesForUserTo, Set<Userhasdepartment> userhasdepartments) {
       this.usercatagory = usercatagory;
       this.userFullName = userFullName;
       this.userDesignation = userDesignation;
       this.userEmail = userEmail;
       this.userPassword = userPassword;
       this.userMobile = userMobile;
       this.userNic = userNic;
       this.userStatus = userStatus;
       this.userImagePath = userImagePath;
       this.userVerify = userVerify;
       this.attachmantbyofficers = attachmantbyofficers;
       this.procesesForUserFrom = procesesForUserFrom;
       this.procesesForUserTo = procesesForUserTo;
       this.userhasdepartments = userhasdepartments;
    }
   
    public Integer getIdUser() {
        return this.idUser;
    }
    
    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }
    public Usercatagory getUsercatagory() {
        return this.usercatagory;
    }
    
    public void setUsercatagory(Usercatagory usercatagory) {
        this.usercatagory = usercatagory;
    }
    public String getUserFullName() {
        return this.userFullName;
    }
    
    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }
    public String getUserDesignation() {
        return this.userDesignation;
    }
    
    public void setUserDesignation(String userDesignation) {
        this.userDesignation = userDesignation;
    }
    public String getUserEmail() {
        return this.userEmail;
    }
    
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public String getUserPassword() {
        return this.userPassword;
    }
    
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public String getUserMobile() {
        return this.userMobile;
    }
    
    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }
    public String getUserNic() {
        return this.userNic;
    }
    
    public void setUserNic(String userNic) {
        this.userNic = userNic;
    }
    public Integer getUserStatus() {
        return this.userStatus;
    }
    
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }
    public String getUserImagePath() {
        return this.userImagePath;
    }
    
    public void setUserImagePath(String userImagePath) {
        this.userImagePath = userImagePath;
    }
    public String getUserVerify() {
        return this.userVerify;
    }
    
    public void setUserVerify(String userVerify) {
        this.userVerify = userVerify;
    }
    public Set<Attachmantbyofficer> getAttachmantbyofficers() {
        return this.attachmantbyofficers;
    }
    
    public void setAttachmantbyofficers(Set<Attachmantbyofficer> attachmantbyofficers) {
        this.attachmantbyofficers = attachmantbyofficers;
    }
    public Set<Proces> getProcesesForUserFrom() {
        return this.procesesForUserFrom;
    }
    
    public void setProcesesForUserFrom(Set<Proces> procesesForUserFrom) {
        this.procesesForUserFrom = procesesForUserFrom;
    }
    public Set<Proces> getProcesesForUserTo() {
        return this.procesesForUserTo;
    }
    
    public void setProcesesForUserTo(Set<Proces> procesesForUserTo) {
        this.procesesForUserTo = procesesForUserTo;
    }
    public Set<Userhasdepartment> getUserhasdepartments() {
        return this.userhasdepartments;
    }
    
    public void setUserhasdepartments(Set<Userhasdepartment> userhasdepartments) {
        this.userhasdepartments = userhasdepartments;
    }




}


