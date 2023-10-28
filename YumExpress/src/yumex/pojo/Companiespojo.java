/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumex.pojo;

/**
 *
 * @author HP
 */
public class Companiespojo {
    private  String companyId;
    private  String comapnyName;
    private  String ownerName;
    private  String password;
    private  String emailId;
    private  String securityKey;
    
    public Companiespojo(){
        
    }

    public Companiespojo(String companyId, String comapnyName, String ownerName, String password, String emailId, String securityKey) {
        this.companyId = companyId;
        this.comapnyName = comapnyName;
        this.ownerName = ownerName;
        this.password = password;
        this.emailId = emailId;
        this.securityKey = securityKey;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getComapnyName() {
        return comapnyName;
    }

    public void setComapnyName(String comapnyName) {
        this.comapnyName = comapnyName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getSecurityKey() {
        return securityKey;
    }

    public void setSecurityKey(String securityKey) {
        this.securityKey = securityKey;
    }
    

}
