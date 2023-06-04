package com.loopkitchen.loopkitchen.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table; 


@Table(name = "menuhours")





//class menuHoursId {
//    String store_id;
//}


//@IdClass(menuHoursId1.class)
@Entity
public class MenuHours {
	 
   //@Id //private int dayNo;
	//@Id// private String store_id;
	 @EmbeddedId private menuHoursId1 mid; 
	
     private String startTime;
     private String endTime;
     
     
		public MenuHours(){
		super();
		// TODO Auto-generated constructor stub
	    }
		
		

      
		public MenuHours(String startTime, String endTime) {
			super();
			this.startTime = startTime;
			this.endTime = endTime;
		}




		public MenuHours(menuHoursId1 mid, String startTime, String endTime) {
			super();
			this.mid = mid;
			this.startTime = startTime;
			this.endTime = endTime;
		}




		public menuHoursId1 getMid() {
			return mid;
		}




		public void setMid(menuHoursId1 mid) {
			this.mid = mid;
		}




		public String getStartTime() {
			return startTime;
		}




		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}




		public String getEndTime() {
			return endTime;
		}




		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}




		//getters and setters of class
		 

       
}
