/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class academics {
    
    private String admission;
    private String courseId;
    private String courseName;
    private String teacher;
    private String grade;
    public academics(String adm,String cid,String cName,String teacher,String grade){
    this.admission=adm;
    this.courseId=cid;
    this.courseName=cName;
    this.teacher=teacher;
    this.grade=grade;
    }
    
     public String getsId(){
    return admission;
    }
     public String getcId(){
    return courseId;
    } 
     public String getcName(){
    return courseName;
    }   
    public String getteacher(){
    return teacher;
    } 
    public String getgrade(){
    return grade;
    }  
}
