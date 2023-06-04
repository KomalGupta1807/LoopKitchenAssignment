package com.loopkitchen.loopkitchen.entity;
import jakarta.persistence.*; 

@Entity
@Table(name = "reportstatus")
public class Report {
	
   @Id
   private String reportId;
   private String status;
   
 
    //default constructor
     
   public Report()
   {
	   
   }
   
   //parametrised constructor
	public Report(String reportId, String status) {
	super();
	this.reportId = reportId;
	this.status = status;
}
	//getters and setters
	public String getReportId() {
		return reportId;
	}
	
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
    }
	
	
   
}
