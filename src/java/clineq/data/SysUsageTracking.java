package clineq.data;
// Generated Mar 6, 2016 3:14:38 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * SysUsageTracking generated by hbm2java
 */
public class SysUsageTracking  implements java.io.Serializable {


     private String trackingId;
     private Users users;
     private Date startDate;
     private Date endDate;
     private String operationUsed;
     private String operationDetail;
     private String remoteDeviceIp;

    public SysUsageTracking() {
    }

	
    public SysUsageTracking(String trackingId) {
        this.trackingId = trackingId;
    }
    public SysUsageTracking(String trackingId, Users users, Date startDate, Date endDate, String operationUsed, String operationDetail, String remoteDeviceIp) {
       this.trackingId = trackingId;
       this.users = users;
       this.startDate = startDate;
       this.endDate = endDate;
       this.operationUsed = operationUsed;
       this.operationDetail = operationDetail;
       this.remoteDeviceIp = remoteDeviceIp;
    }
   
    public String getTrackingId() {
        return this.trackingId;
    }
    
    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }
    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public String getOperationUsed() {
        return this.operationUsed;
    }
    
    public void setOperationUsed(String operationUsed) {
        this.operationUsed = operationUsed;
    }
    public String getOperationDetail() {
        return this.operationDetail;
    }
    
    public void setOperationDetail(String operationDetail) {
        this.operationDetail = operationDetail;
    }
    public String getRemoteDeviceIp() {
        return this.remoteDeviceIp;
    }
    
    public void setRemoteDeviceIp(String remoteDeviceIp) {
        this.remoteDeviceIp = remoteDeviceIp;
    }




}


