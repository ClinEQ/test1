package clineq.data;
// Generated Mar 6, 2016 3:14:38 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * StudyChartCategory generated by hbm2java
 */
public class StudyChartCategory  implements java.io.Serializable {


     private String chartCategoryId;
     private StudyChartGroup studyChartGroup;
     private String chartCategoryName;
     private String chartType;
     private String sysCodeId;
     private BigDecimal chartCategorySeq;
     private String chartCategoryStatus;

    public StudyChartCategory() {
    }

	
    public StudyChartCategory(String chartCategoryId) {
        this.chartCategoryId = chartCategoryId;
    }
    public StudyChartCategory(String chartCategoryId, StudyChartGroup studyChartGroup, String chartCategoryName, String chartType, String sysCodeId, BigDecimal chartCategorySeq, String chartCategoryStatus) {
       this.chartCategoryId = chartCategoryId;
       this.studyChartGroup = studyChartGroup;
       this.chartCategoryName = chartCategoryName;
       this.chartType = chartType;
       this.sysCodeId = sysCodeId;
       this.chartCategorySeq = chartCategorySeq;
       this.chartCategoryStatus = chartCategoryStatus;
    }
   
    public String getChartCategoryId() {
        return this.chartCategoryId;
    }
    
    public void setChartCategoryId(String chartCategoryId) {
        this.chartCategoryId = chartCategoryId;
    }
    public StudyChartGroup getStudyChartGroup() {
        return this.studyChartGroup;
    }
    
    public void setStudyChartGroup(StudyChartGroup studyChartGroup) {
        this.studyChartGroup = studyChartGroup;
    }
    public String getChartCategoryName() {
        return this.chartCategoryName;
    }
    
    public void setChartCategoryName(String chartCategoryName) {
        this.chartCategoryName = chartCategoryName;
    }
    public String getChartType() {
        return this.chartType;
    }
    
    public void setChartType(String chartType) {
        this.chartType = chartType;
    }
    public String getSysCodeId() {
        return this.sysCodeId;
    }
    
    public void setSysCodeId(String sysCodeId) {
        this.sysCodeId = sysCodeId;
    }
    public BigDecimal getChartCategorySeq() {
        return this.chartCategorySeq;
    }
    
    public void setChartCategorySeq(BigDecimal chartCategorySeq) {
        this.chartCategorySeq = chartCategorySeq;
    }
    public String getChartCategoryStatus() {
        return this.chartCategoryStatus;
    }
    
    public void setChartCategoryStatus(String chartCategoryStatus) {
        this.chartCategoryStatus = chartCategoryStatus;
    }




}


