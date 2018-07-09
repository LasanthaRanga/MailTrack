package pojo;
// Generated Jul 10, 2018 4:31:37 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Mailstatus generated by hbm2java
 */
public class Mailstatus  implements java.io.Serializable {


     private Integer idMailStatus;
     private String mailStatusName;
     private Integer mailStatusStatus;
     private Set<Proces> proceses = new HashSet<Proces>(0);
     private Set<Mailinfo> mailinfos = new HashSet<Mailinfo>(0);

    public Mailstatus() {
    }

    public Mailstatus(String mailStatusName, Integer mailStatusStatus, Set<Proces> proceses, Set<Mailinfo> mailinfos) {
       this.mailStatusName = mailStatusName;
       this.mailStatusStatus = mailStatusStatus;
       this.proceses = proceses;
       this.mailinfos = mailinfos;
    }
   
    public Integer getIdMailStatus() {
        return this.idMailStatus;
    }
    
    public void setIdMailStatus(Integer idMailStatus) {
        this.idMailStatus = idMailStatus;
    }
    public String getMailStatusName() {
        return this.mailStatusName;
    }
    
    public void setMailStatusName(String mailStatusName) {
        this.mailStatusName = mailStatusName;
    }
    public Integer getMailStatusStatus() {
        return this.mailStatusStatus;
    }
    
    public void setMailStatusStatus(Integer mailStatusStatus) {
        this.mailStatusStatus = mailStatusStatus;
    }
    public Set<Proces> getProceses() {
        return this.proceses;
    }
    
    public void setProceses(Set<Proces> proceses) {
        this.proceses = proceses;
    }
    public Set<Mailinfo> getMailinfos() {
        return this.mailinfos;
    }
    
    public void setMailinfos(Set<Mailinfo> mailinfos) {
        this.mailinfos = mailinfos;
    }




}


