package com.loopkitchen.loopkitchen.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class storeid implements Serializable {
	public static final long serialVersionUID = 1L;
    private String store_id;
    private String timestamp_utc;
    public storeid()
     {
    	 
     }
     
     
     
	public storeid(String store_id, String timestamp_utc) {
		super();
		this.store_id = store_id;
		this.timestamp_utc = timestamp_utc;
	}



	public String getStore_id() {
		return store_id;
	}
	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}
	public String getTimestamp_utc() {
		return timestamp_utc;
	}
	public void setTimestamp_utc(String timestamp_utc) {
		this.timestamp_utc = timestamp_utc;
	}
	@Override
	public int hashCode() {
		return Objects.hash(store_id, timestamp_utc);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		storeid other = (storeid) obj;
		return Objects.equals(store_id, other.store_id) && Objects.equals(timestamp_utc, other.timestamp_utc);
	}
     
     
}
