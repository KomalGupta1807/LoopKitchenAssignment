package com.loopkitchen.loopkitchen.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;

@Embeddable
public class menuHoursId1 implements Serializable{
   private String store_id;
   private int dayNo;
   
   public menuHoursId1()
   {
	   
   }
	 public menuHoursId1(String s, int d)
	  {
		  this.store_id = s;
		  this.dayNo = d;
	  }
	public String getStore_id() {
		return store_id;
	}
	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}
	public int getDayNo() {
		return dayNo;
	}
	public void setDayNo(int dayNo) {
		this.dayNo = dayNo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dayNo, store_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		menuHoursId1 other = (menuHoursId1) obj;
		return dayNo == other.dayNo && Objects.equals(store_id, other.store_id);
	}
	 
		 
}
