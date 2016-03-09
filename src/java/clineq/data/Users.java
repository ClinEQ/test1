package clineq.data;
// Generated Mar 6, 2016 3:14:38 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Users generated by hbm2java
 */
public class Users  implements java.io.Serializable {


     private String eqUserId;
     private Organizations organizations;
     private String lname;
     private String fname;
     private String title;
     private Date setupDate;
     private Date lastUpdateDate;
     private String address1;
     private String address2;
     private String zip;
     private String phone;
     private String email;
     private String city;
     private String state;
     private String country;
     private String status;
     private String externalEmployerId;
     private String externalDeptName;
     private String userType;
     private String userRole;
     private String userLoginId;
     private String userLoginPwd;
     private String fax;
     private Set<StudyUserMap> studyUserMaps = new HashSet<StudyUserMap>(0);
     private Set<SysUsageTracking> sysUsageTrackings = new HashSet<SysUsageTracking>(0);
     private Set<Messags> messagses = new HashSet<Messags>(0);

    public Users() {
    }

	
    public Users(String eqUserId) {
        this.eqUserId = eqUserId;
    }
    public Users(String eqUserId, Organizations organizations, String lname, String fname, String title, Date setupDate, Date lastUpdateDate, String address1, String address2, String zip, String phone, String email, String city, String state, String country, String status, String externalEmployerId, String externalDeptName, String userType, String userRole, String userLoginId, String userLoginPwd, String fax, Set<StudyUserMap> studyUserMaps, Set<SysUsageTracking> sysUsageTrackings, Set<Messags> messagses) {
       this.eqUserId = eqUserId;
       this.organizations = organizations;
       this.lname = lname;
       this.fname = fname;
       this.title = title;
       this.setupDate = setupDate;
       this.lastUpdateDate = lastUpdateDate;
       this.address1 = address1;
       this.address2 = address2;
       this.zip = zip;
       this.phone = phone;
       this.email = email;
       this.city = city;
       this.state = state;
       this.country = country;
       this.status = status;
       this.externalEmployerId = externalEmployerId;
       this.externalDeptName = externalDeptName;
       this.userType = userType;
       this.userRole = userRole;
       this.userLoginId = userLoginId;
       this.userLoginPwd = userLoginPwd;
       this.fax = fax;
       this.studyUserMaps = studyUserMaps;
       this.sysUsageTrackings = sysUsageTrackings;
       this.messagses = messagses;
    }
   
    public String getEqUserId() {
        return this.eqUserId;
    }
    
    public void setEqUserId(String eqUserId) {
        this.eqUserId = eqUserId;
    }
    public Organizations getOrganizations() {
        return this.organizations;
    }
    
    public void setOrganizations(Organizations organizations) {
        this.organizations = organizations;
    }
    public String getLname() {
        return this.lname;
    }
    
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getFname() {
        return this.fname;
    }
    
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public Date getSetupDate() {
        return this.setupDate;
    }
    
    public void setSetupDate(Date setupDate) {
        this.setupDate = setupDate;
    }
    public Date getLastUpdateDate() {
        return this.lastUpdateDate;
    }
    
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
    public String getAddress1() {
        return this.address1;
    }
    
    public void setAddress1(String address1) {
        this.address1 = address1;
    }
    public String getAddress2() {
        return this.address2;
    }
    
    public void setAddress2(String address2) {
        this.address2 = address2;
    }
    public String getZip() {
        return this.zip;
    }
    
    public void setZip(String zip) {
        this.zip = zip;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public String getExternalEmployerId() {
        return this.externalEmployerId;
    }
    
    public void setExternalEmployerId(String externalEmployerId) {
        this.externalEmployerId = externalEmployerId;
    }
    public String getExternalDeptName() {
        return this.externalDeptName;
    }
    
    public void setExternalDeptName(String externalDeptName) {
        this.externalDeptName = externalDeptName;
    }
    public String getUserType() {
        return this.userType;
    }
    
    public void setUserType(String userType) {
        this.userType = userType;
    }
    public String getUserRole() {
        return this.userRole;
    }
    
    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
    public String getUserLoginId() {
        return this.userLoginId;
    }
    
    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }
    public String getUserLoginPwd() {
        return this.userLoginPwd;
    }
    
    public void setUserLoginPwd(String userLoginPwd) {
        this.userLoginPwd = userLoginPwd;
    }
    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }
    public Set<StudyUserMap> getStudyUserMaps() {
        return this.studyUserMaps;
    }
    
    public void setStudyUserMaps(Set<StudyUserMap> studyUserMaps) {
        this.studyUserMaps = studyUserMaps;
    }
    public Set<SysUsageTracking> getSysUsageTrackings() {
        return this.sysUsageTrackings;
    }
    
    public void setSysUsageTrackings(Set<SysUsageTracking> sysUsageTrackings) {
        this.sysUsageTrackings = sysUsageTrackings;
    }
    public Set<Messags> getMessagses() {
        return this.messagses;
    }
    
    public void setMessagses(Set<Messags> messagses) {
        this.messagses = messagses;
    }




}


