package clineq.data;
// Generated Mar 6, 2016 3:14:38 PM by Hibernate Tools 4.3.1



/**
 * StudySiteMapId generated by hbm2java
 */
public class StudySiteMapId  implements java.io.Serializable {


     private String eqStudyId;
     private String eqSiteId;

    public StudySiteMapId() {
    }

    public StudySiteMapId(String eqStudyId, String eqSiteId) {
       this.eqStudyId = eqStudyId;
       this.eqSiteId = eqSiteId;
    }
   
    public String getEqStudyId() {
        return this.eqStudyId;
    }
    
    public void setEqStudyId(String eqStudyId) {
        this.eqStudyId = eqStudyId;
    }
    public String getEqSiteId() {
        return this.eqSiteId;
    }
    
    public void setEqSiteId(String eqSiteId) {
        this.eqSiteId = eqSiteId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof StudySiteMapId) ) return false;
		 StudySiteMapId castOther = ( StudySiteMapId ) other; 
         
		 return ( (this.getEqStudyId()==castOther.getEqStudyId()) || ( this.getEqStudyId()!=null && castOther.getEqStudyId()!=null && this.getEqStudyId().equals(castOther.getEqStudyId()) ) )
 && ( (this.getEqSiteId()==castOther.getEqSiteId()) || ( this.getEqSiteId()!=null && castOther.getEqSiteId()!=null && this.getEqSiteId().equals(castOther.getEqSiteId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getEqStudyId() == null ? 0 : this.getEqStudyId().hashCode() );
         result = 37 * result + ( getEqSiteId() == null ? 0 : this.getEqSiteId().hashCode() );
         return result;
   }   


}


