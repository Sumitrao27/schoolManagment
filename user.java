
public class user {
 
private String admission;
private String name;
private int clss;
private java.sql.Date da;
private String email;
private String father;
private String phno;
private String address;

public user(String adms,String nam,int cls,java.sql.Date date,String eml,String fath,String no,String add){
this.admission=adms;
this.name=nam;
this.clss=cls;
this.da=date;
this.email=eml;
this.father=fath;
this.phno=no;
this.address=add;
}
public String getId(){
return admission;
}
public int getClss(){
return clss;
}

public String getname(){
return name;
}
public String getemail(){
return email;
}
public  java.sql.Date getDate(){
return da;
}
public String getphno(){
return phno;
}
public String getFather(){
return father;
}
public String getAddress(){
return address;
}

}
