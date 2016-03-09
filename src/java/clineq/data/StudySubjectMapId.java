package clineq.data;
// Generated Mar 6, 2016 3:14:38 PM by Hibernate Tools 4.3.1



/**
 * StudySubjectMapId generated by hbm2java
 */
public class StudySubjectMapId  implements java.io.Serializable {


     private String eqStudyId;
     private String eqSubjectId;

    public StudySubjectMapId() {
    }

    public StudySubjectMapId(String eqStudyId, String eqSubjectId) {
       this.eqStudyId = eqStudyId;
       this.eqSubjectId = eqSubjectId;
    }
   
    public String getEqStudyId() {
        return this.eqStudyId;
    }
    
    public void setEqStudyId(String eqStudyId) {
        this.eqStudyId = eqStudyId;
    }
    public String getEqSubjectId() {
        return this.eqSubjectId;
    }
    
    public void setEqSubjectId(String eqSubjectId) {
        this.eqSubjectId = eqSubjectId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof StudySubjectMapId) ) return false;
		 StudySubjectMapId castOther = ( StudySubjectMapId ) other; 
         
		 return ( (this.getEqStudyId()==castOther.getEqStudyId()) || ( this.getEqStudyId()!=null && castOther.getEqStudyId()!=null && this.getEqStudyId().equals(castOther.getEqStudyId()) ) )
 && ( (this.getEqSubjectId()==castOther.getEqSubjectId()) || ( this.getEqSubjectId()!=null && castOther.getEqSubjectId()!=null && this.getEqSubjectId().equals(castOther.getEqSubjectId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getEqStudyId() == null ? 0 : this.getEqStudyId().hashCode() );
         result = 37 * result + ( getEqSubjectId() == null ? 0 : this.getEqSubjectId().hashCode() );
         return result;
   }   


}


