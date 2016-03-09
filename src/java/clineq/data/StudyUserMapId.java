package clineq.data;
// Generated Mar 6, 2016 3:14:38 PM by Hibernate Tools 4.3.1



/**
 * StudyUserMapId generated by hbm2java
 */
public class StudyUserMapId  implements java.io.Serializable {


     private String eqStudyId;
     private String eqUserId;

    public StudyUserMapId() {
    }

    public StudyUserMapId(String eqStudyId, String eqUserId) {
       this.eqStudyId = eqStudyId;
       this.eqUserId = eqUserId;
    }
   
    public String getEqStudyId() {
        return this.eqStudyId;
    }
    
    public void setEqStudyId(String eqStudyId) {
        this.eqStudyId = eqStudyId;
    }
    public String getEqUserId() {
        return this.eqUserId;
    }
    
    public void setEqUserId(String eqUserId) {
        this.eqUserId = eqUserId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof StudyUserMapId) ) return false;
		 StudyUserMapId castOther = ( StudyUserMapId ) other; 
         
		 return ( (this.getEqStudyId()==castOther.getEqStudyId()) || ( this.getEqStudyId()!=null && castOther.getEqStudyId()!=null && this.getEqStudyId().equals(castOther.getEqStudyId()) ) )
 && ( (this.getEqUserId()==castOther.getEqUserId()) || ( this.getEqUserId()!=null && castOther.getEqUserId()!=null && this.getEqUserId().equals(castOther.getEqUserId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getEqStudyId() == null ? 0 : this.getEqStudyId().hashCode() );
         result = 37 * result + ( getEqUserId() == null ? 0 : this.getEqUserId().hashCode() );
         return result;
   }   


}


