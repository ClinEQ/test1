package clineq.data;
// Generated Mar 6, 2016 3:14:38 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Organizations generated by hbm2java
 */
public class Organizations  implements java.io.Serializable {


     private String eqOrgId;
     private String orgFullName;
     private String orgNameAbbr;
     private String orgDisplayName;
     private String orgType;
     private String orgCategory;
     private String address1;
     private String address2;
     private String city;
     private String state;
     private String zip;
     private String country;
     private String phone;
     private String fax;
     private String orgUrl;
     private String notes;
     private String status;
     private Set<Studies> studiesesForEqIwrsId = new HashSet<Studies>(0);
     private Set<Studies> studiesesForEqSponId = new HashSet<Studies>(0);
     private Set<OrgDetail> orgDetails = new HashSet<OrgDetail>(0);
     private Set<Users> userses = new HashSet<Users>(0);
     private Set<Subjects> subjectses = new HashSet<Subjects>(0);
     private Set<StudySiteMap> studySiteMaps = new HashSet<StudySiteMap>(0);

    public Organizations() {
    }

	
    public Organizations(String eqOrgId) {
        this.eqOrgId = eqOrgId;
    }
    public Organizations(String eqOrgId, String orgFullName, String orgNameAbbr, String orgDisplayName, String orgType, String orgCategory, String address1, String address2, String city, String state, String zip, String country, String phone, String fax, String orgUrl, String notes, String status, Set<Studies> studiesesForEqIwrsId, Set<Studies> studiesesForEqSponId, Set<OrgDetail> orgDetails, Set<Users> userses, Set<Subjects> subjectses, Set<StudySiteMap> studySiteMaps) {
       this.eqOrgId = eqOrgId;
       this.orgFullName = orgFullName;
       this.orgNameAbbr = orgNameAbbr;
       this.orgDisplayName = orgDisplayName;
       this.orgType = orgType;
       this.orgCategory = orgCategory;
       this.address1 = address1;
       this.address2 = address2;
       this.city = city;
       this.state = state;
       this.zip = zip;
       this.country = country;
       this.phone = phone;
       this.fax = fax;
       this.orgUrl = orgUrl;
       this.notes = notes;
       this.status = status;
       this.studiesesForEqIwrsId = studiesesForEqIwrsId;
       this.studiesesForEqSponId = studiesesForEqSponId;
       this.orgDetails = orgDetails;
       this.userses = userses;
       this.subjectses = subjectses;
       this.studySiteMaps = studySiteMaps;
    }
   
    public String getEqOrgId() {
        return this.eqOrgId;
    }
    
    public void setEqOrgId(String eqOrgId) {
        this.eqOrgId = eqOrgId;
    }
    public String getOrgFullName() {
        return this.orgFullName;
    }
    
    public void setOrgFullName(String orgFullName) {
        this.orgFullName = orgFullName;
    }
    public String getOrgNameAbbr() {
        return this.orgNameAbbr;
    }
    
    public void setOrgNameAbbr(String orgNameAbbr) {
        this.orgNameAbbr = orgNameAbbr;
    }
    public String getOrgDisplayName() {
        return this.orgDisplayName;
    }
    
    public void setOrgDisplayName(String orgDisplayName) {
        this.orgDisplayName = orgDisplayName;
    }
    public String getOrgType() {
        return this.orgType;
    }
    
    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }
    public String getOrgCategory() {
        return this.orgCategory;
    }
    
    public void setOrgCategory(String orgCategory) {
        this.orgCategory = orgCategory;
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
    public String getZip() {
        return this.zip;
    }
    
    public void setZip(String zip) {
        this.zip = zip;
    }
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }
    public String getOrgUrl() {
        return this.orgUrl;
    }
    
    public void setOrgUrl(String orgUrl) {
        this.orgUrl = orgUrl;
    }
    public String getNotes() {
        return this.notes;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Set<Studies> getStudiesesForEqIwrsId() {
        return this.studiesesForEqIwrsId;
    }
    
    public void setStudiesesForEqIwrsId(Set<Studies> studiesesForEqIwrsId) {
        this.studiesesForEqIwrsId = studiesesForEqIwrsId;
    }
    public Set<Studies> getStudiesesForEqSponId() {
        return this.studiesesForEqSponId;
    }
    
    public void setStudiesesForEqSponId(Set<Studies> studiesesForEqSponId) {
        this.studiesesForEqSponId = studiesesForEqSponId;
    }
    public Set<OrgDetail> getOrgDetails() {
        return this.orgDetails;
    }
    
    public void setOrgDetails(Set<OrgDetail> orgDetails) {
        this.orgDetails = orgDetails;
    }
    public Set<Users> getUserses() {
        return this.userses;
    }
    
    public void setUserses(Set<Users> userses) {
        this.userses = userses;
    }
    public Set<Subjects> getSubjectses() {
        return this.subjectses;
    }
    
    public void setSubjectses(Set<Subjects> subjectses) {
        this.subjectses = subjectses;
    }
    public Set<StudySiteMap> getStudySiteMaps() {
        return this.studySiteMaps;
    }
    
    public void setStudySiteMaps(Set<StudySiteMap> studySiteMaps) {
        this.studySiteMaps = studySiteMaps;
    }




}

