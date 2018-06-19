package pojo;
// Generated Jun 19, 2018 11:31:05 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Mailinfo generated by hbm2java
 */
public class Mailinfo  implements java.io.Serializable {


     private Integer idMailInfo;
     private Mailcatagory mailcatagory;
     private Mailstatus mailstatus;
     private String mailInfoSender;
     private String mailInfoInstitute;
     private Date mailInfoReceivedDate;
     private String mailInfoTitle;
     private String mailInfoAssessmentNo;
     private String mailInfoMyNo;
     private Date mailInfoDeadline;
     private Integer mailInfoPageCount;
     private String mailInfoComment;
     private Set<Proces> proceses = new HashSet<Proces>(0);
     private Set<Attachmant> attachmants = new HashSet<Attachmant>(0);
     private Set<Attachmantbyofficer> attachmantbyofficers = new HashSet<Attachmantbyofficer>(0);

    public Mailinfo() {
    }

	
    public Mailinfo(Mailcatagory mailcatagory, Mailstatus mailstatus) {
        this.mailcatagory = mailcatagory;
        this.mailstatus = mailstatus;
    }
    public Mailinfo(Mailcatagory mailcatagory, Mailstatus mailstatus, String mailInfoSender, String mailInfoInstitute, Date mailInfoReceivedDate, String mailInfoTitle, String mailInfoAssessmentNo, String mailInfoMyNo, Date mailInfoDeadline, Integer mailInfoPageCount, String mailInfoComment, Set<Proces> proceses, Set<Attachmant> attachmants, Set<Attachmantbyofficer> attachmantbyofficers) {
       this.mailcatagory = mailcatagory;
       this.mailstatus = mailstatus;
       this.mailInfoSender = mailInfoSender;
       this.mailInfoInstitute = mailInfoInstitute;
       this.mailInfoReceivedDate = mailInfoReceivedDate;
       this.mailInfoTitle = mailInfoTitle;
       this.mailInfoAssessmentNo = mailInfoAssessmentNo;
       this.mailInfoMyNo = mailInfoMyNo;
       this.mailInfoDeadline = mailInfoDeadline;
       this.mailInfoPageCount = mailInfoPageCount;
       this.mailInfoComment = mailInfoComment;
       this.proceses = proceses;
       this.attachmants = attachmants;
       this.attachmantbyofficers = attachmantbyofficers;
    }
   
    public Integer getIdMailInfo() {
        return this.idMailInfo;
    }
    
    public void setIdMailInfo(Integer idMailInfo) {
        this.idMailInfo = idMailInfo;
    }
    public Mailcatagory getMailcatagory() {
        return this.mailcatagory;
    }
    
    public void setMailcatagory(Mailcatagory mailcatagory) {
        this.mailcatagory = mailcatagory;
    }
    public Mailstatus getMailstatus() {
        return this.mailstatus;
    }
    
    public void setMailstatus(Mailstatus mailstatus) {
        this.mailstatus = mailstatus;
    }
    public String getMailInfoSender() {
        return this.mailInfoSender;
    }
    
    public void setMailInfoSender(String mailInfoSender) {
        this.mailInfoSender = mailInfoSender;
    }
    public String getMailInfoInstitute() {
        return this.mailInfoInstitute;
    }
    
    public void setMailInfoInstitute(String mailInfoInstitute) {
        this.mailInfoInstitute = mailInfoInstitute;
    }
    public Date getMailInfoReceivedDate() {
        return this.mailInfoReceivedDate;
    }
    
    public void setMailInfoReceivedDate(Date mailInfoReceivedDate) {
        this.mailInfoReceivedDate = mailInfoReceivedDate;
    }
    public String getMailInfoTitle() {
        return this.mailInfoTitle;
    }
    
    public void setMailInfoTitle(String mailInfoTitle) {
        this.mailInfoTitle = mailInfoTitle;
    }
    public String getMailInfoAssessmentNo() {
        return this.mailInfoAssessmentNo;
    }
    
    public void setMailInfoAssessmentNo(String mailInfoAssessmentNo) {
        this.mailInfoAssessmentNo = mailInfoAssessmentNo;
    }
    public String getMailInfoMyNo() {
        return this.mailInfoMyNo;
    }
    
    public void setMailInfoMyNo(String mailInfoMyNo) {
        this.mailInfoMyNo = mailInfoMyNo;
    }
    public Date getMailInfoDeadline() {
        return this.mailInfoDeadline;
    }
    
    public void setMailInfoDeadline(Date mailInfoDeadline) {
        this.mailInfoDeadline = mailInfoDeadline;
    }
    public Integer getMailInfoPageCount() {
        return this.mailInfoPageCount;
    }
    
    public void setMailInfoPageCount(Integer mailInfoPageCount) {
        this.mailInfoPageCount = mailInfoPageCount;
    }
    public String getMailInfoComment() {
        return this.mailInfoComment;
    }
    
    public void setMailInfoComment(String mailInfoComment) {
        this.mailInfoComment = mailInfoComment;
    }
    public Set<Proces> getProceses() {
        return this.proceses;
    }
    
    public void setProceses(Set<Proces> proceses) {
        this.proceses = proceses;
    }
    public Set<Attachmant> getAttachmants() {
        return this.attachmants;
    }
    
    public void setAttachmants(Set<Attachmant> attachmants) {
        this.attachmants = attachmants;
    }
    public Set<Attachmantbyofficer> getAttachmantbyofficers() {
        return this.attachmantbyofficers;
    }
    
    public void setAttachmantbyofficers(Set<Attachmantbyofficer> attachmantbyofficers) {
        this.attachmantbyofficers = attachmantbyofficers;
    }




}


