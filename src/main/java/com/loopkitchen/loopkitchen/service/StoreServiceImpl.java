package com.loopkitchen.loopkitchen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loopkitchen.loopkitchen.dao.ReportDao;
import com.loopkitchen.loopkitchen.dao.StoreDao;
import com.loopkitchen.loopkitchen.entity.*;

@Service
public class StoreServiceImpl implements StoreService{
     
	@Autowired
    private StoreDao s;
	
	//constructor
	StoreServiceImpl()
	{
		
	}
	
	
	public void getValues()
	{
		
		/*Store ss = s.findById(new storeid("14964749219696400","2023-01-25 10:08:29.702743 UTC")).get();
			//	System.out.println(ss.getStore_status());
				System.out.println(ss.getStore_status());
			 storeid s = ss.getS();
			 System.out.println(s.getStore_id());
			 System.out.println(s.getTimestamp_utc());*/

		List<Store> ss = s.findByStoreId("257406274356679");
		for(Store st : ss)
		{
			System.out.println("data is");
			System.out.println(st.getStore_status());
			System.out.println(st.getS().getStore_id());
			System.out.println(st.getS().getTimestamp_utc());
			
		}
	}
}

