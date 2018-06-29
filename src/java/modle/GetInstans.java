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
    private static modle.MailCatagory mailCatagory;
    private static modle.NewMail newMail;
    private static modle.UploadMail uploadMail;
    private static modle.MailList mailList;
    private static modle.Process process;
   
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

    /**
     * @return the mailCatagory
     */
    public static modle.MailCatagory getMailCatagory() {
        if(mailCatagory==null){mailCatagory = new MailCatagory();}
        return mailCatagory;
    }

    /**
     * @return the newMail
     */
    public static modle.NewMail getNewMail() {
        if(newMail==null){newMail = new NewMail();}
        return newMail;
    }

    /**
     * @return the uploadMail
     */
    public static modle.UploadMail getUploadMail() {
        if(uploadMail==null){uploadMail = new UploadMail();}
        return uploadMail;
    }

    /**
     * @return the mailList
     */
    public static modle.MailList getMailList() {
        if(mailList==null){mailList= new MailList();}
        return mailList;
    }

    /**
     * @return the process
     */
    public static modle.Process getProcess() {
        if(process==null){process= new Process(); }
        return process;
    }

    

}
