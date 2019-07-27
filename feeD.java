/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class feeD {
    private String admission;
    private String status;
    private String monthly;
    
    public feeD(String adm,String stat,String mon){
    this.admission=adm;
    this.monthly=mon;
    this.status=stat;
    }
    
    public String getadm(){
    return admission;
    }
    
    public String getStatus(){
    return status;
    }
    public String getMonthly(){
    return monthly;
    }
    
    
}
