package com.loopkitchen.loopkitchen.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "store")
public class Store {
	
	
	 @EmbeddedId private storeid s;
	     private String store_status;
		Store()
		{
			
		}
		
		
		public Store(storeid s, String store_status) {
			super();
			this.s = s;
			this.store_status = store_status;
		}
/*		public Store(String store_status) {
			super();
			this.store_status = store_status;
		}*/ 	
		public storeid getS() {
			return s;
		}
		public void setS(storeid s) {
			this.s = s;
		}
		public String getStore_status() {
			return store_status;
		}
		public void setStore_status(String store_status) {
			this.store_status = store_status;
		}
		
		
		
}
