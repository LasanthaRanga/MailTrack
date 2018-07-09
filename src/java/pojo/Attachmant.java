package pojo;
// Generated Jul 10, 2018 4:31:37 AM by Hibernate Tools 4.3.1



/**
 * Attachmant generated by hbm2java
 */
public class Attachmant  implements java.io.Serializable {


     private Integer idAttachmant;
     private Mailinfo mailinfo;
     private String attachmantTitle;
     private String attachmantPath;
     private Integer attachmantNumber;

    public Attachmant() {
    }

	
    public Attachmant(Mailinfo mailinfo) {
        this.mailinfo = mailinfo;
    }
    public Attachmant(Mailinfo mailinfo, String attachmantTitle, String attachmantPath, Integer attachmantNumber) {
       this.mailinfo = mailinfo;
       this.attachmantTitle = attachmantTitle;
       this.attachmantPath = attachmantPath;
       this.attachmantNumber = attachmantNumber;
    }
   
    public Integer getIdAttachmant() {
        return this.idAttachmant;
    }
    
    public void setIdAttachmant(Integer idAttachmant) {
        this.idAttachmant = idAttachmant;
    }
    public Mailinfo getMailinfo() {
        return this.mailinfo;
    }
    
    public void setMailinfo(Mailinfo mailinfo) {
        this.mailinfo = mailinfo;
    }
    public String getAttachmantTitle() {
        return this.attachmantTitle;
    }
    
    public void setAttachmantTitle(String attachmantTitle) {
        this.attachmantTitle = attachmantTitle;
    }
    public String getAttachmantPath() {
        return this.attachmantPath;
    }
    
    public void setAttachmantPath(String attachmantPath) {
        this.attachmantPath = attachmantPath;
    }
    public Integer getAttachmantNumber() {
        return this.attachmantNumber;
    }
    
    public void setAttachmantNumber(Integer attachmantNumber) {
        this.attachmantNumber = attachmantNumber;
    }




}

