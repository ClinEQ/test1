package clineq.data;
// Generated Mar 6, 2016 3:14:38 PM by Hibernate Tools 4.3.1



/**
 * OrgDetailId generated by hbm2java
 */
public class OrgDetailId  implements java.io.Serializable {


     private String eqOrgId;
     private String itemName;
     private String itemStatus;

    public OrgDetailId() {
    }

    public OrgDetailId(String eqOrgId, String itemName, String itemStatus) {
       this.eqOrgId = eqOrgId;
       this.itemName = itemName;
       this.itemStatus = itemStatus;
    }
   
    public String getEqOrgId() {
        return this.eqOrgId;
    }
    
    public void setEqOrgId(String eqOrgId) {
        this.eqOrgId = eqOrgId;
    }
    public String getItemName() {
        return this.itemName;
    }
    
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public String getItemStatus() {
        return this.itemStatus;
    }
    
    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof OrgDetailId) ) return false;
		 OrgDetailId castOther = ( OrgDetailId ) other; 
         
		 return ( (this.getEqOrgId()==castOther.getEqOrgId()) || ( this.getEqOrgId()!=null && castOther.getEqOrgId()!=null && this.getEqOrgId().equals(castOther.getEqOrgId()) ) )
 && ( (this.getItemName()==castOther.getItemName()) || ( this.getItemName()!=null && castOther.getItemName()!=null && this.getItemName().equals(castOther.getItemName()) ) )
 && ( (this.getItemStatus()==castOther.getItemStatus()) || ( this.getItemStatus()!=null && castOther.getItemStatus()!=null && this.getItemStatus().equals(castOther.getItemStatus()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getEqOrgId() == null ? 0 : this.getEqOrgId().hashCode() );
         result = 37 * result + ( getItemName() == null ? 0 : this.getItemName().hashCode() );
         result = 37 * result + ( getItemStatus() == null ? 0 : this.getItemStatus().hashCode() );
         return result;
   }   


}


