package com.loopkitchen.loopkitchen.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stores_timezone")
public class StoreTimezone {
	
	@Id
    private String store_id;
    private String timezone;
    
    
	public StoreTimezone() {
		super();
		// TODO Auto-generated constructor stub
	}


	public StoreTimezone(String store_id, String timezone) {
		super();
		this.store_id = store_id;
		this.timezone = timezone;
	}


	public String getStore_id() {
		return store_id;
	}


	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}


	public String getTimezone() {
		return timezone;
	}


	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	
	
}
