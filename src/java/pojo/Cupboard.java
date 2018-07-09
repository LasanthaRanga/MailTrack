package pojo;
// Generated Jul 10, 2018 4:31:37 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cupboard generated by hbm2java
 */
public class Cupboard  implements java.io.Serializable {


     private Integer idCupboard;
     private String cupboardNo;
     private String cupboardStatus;
     private Set<Rack> racks = new HashSet<Rack>(0);

    public Cupboard() {
    }

    public Cupboard(String cupboardNo, String cupboardStatus, Set<Rack> racks) {
       this.cupboardNo = cupboardNo;
       this.cupboardStatus = cupboardStatus;
       this.racks = racks;
    }
   
    public Integer getIdCupboard() {
        return this.idCupboard;
    }
    
    public void setIdCupboard(Integer idCupboard) {
        this.idCupboard = idCupboard;
    }
    public String getCupboardNo() {
        return this.cupboardNo;
    }
    
    public void setCupboardNo(String cupboardNo) {
        this.cupboardNo = cupboardNo;
    }
    public String getCupboardStatus() {
        return this.cupboardStatus;
    }
    
    public void setCupboardStatus(String cupboardStatus) {
        this.cupboardStatus = cupboardStatus;
    }
    public Set<Rack> getRacks() {
        return this.racks;
    }
    
    public void setRacks(Set<Rack> racks) {
        this.racks = racks;
    }




}

