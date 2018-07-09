package pojo;
// Generated Jul 10, 2018 4:31:37 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Mailcatagory generated by hbm2java
 */
public class Mailcatagory  implements java.io.Serializable {


     private Integer idMailCatagory;
     private String mailCatagoryCatagory;
     private Integer mailCatagoryStatus;
     private Set<Mailinfo> mailinfos = new HashSet<Mailinfo>(0);

    public Mailcatagory() {
    }

    public Mailcatagory(String mailCatagoryCatagory, Integer mailCatagoryStatus, Set<Mailinfo> mailinfos) {
       this.mailCatagoryCatagory = mailCatagoryCatagory;
       this.mailCatagoryStatus = mailCatagoryStatus;
       this.mailinfos = mailinfos;
    }
   
    public Integer getIdMailCatagory() {
        return this.idMailCatagory;
    }
    
    public void setIdMailCatagory(Integer idMailCatagory) {
        this.idMailCatagory = idMailCatagory;
    }
    public String getMailCatagoryCatagory() {
        return this.mailCatagoryCatagory;
    }
    
    public void setMailCatagoryCatagory(String mailCatagoryCatagory) {
        this.mailCatagoryCatagory = mailCatagoryCatagory;
    }
    public Integer getMailCatagoryStatus() {
        return this.mailCatagoryStatus;
    }
    
    public void setMailCatagoryStatus(Integer mailCatagoryStatus) {
        this.mailCatagoryStatus = mailCatagoryStatus;
    }
    public Set<Mailinfo> getMailinfos() {
        return this.mailinfos;
    }
    
    public void setMailinfos(Set<Mailinfo> mailinfos) {
        this.mailinfos = mailinfos;
    }




}


