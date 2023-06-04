package com.loopkitchen.loopkitchen.service;
import com.loopkitchen.loopkitchen.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loopkitchen.loopkitchen.dao.ReportDao;
import com.loopkitchen.loopkitchen.dao.StoreTimezoneDao;

@Service
public class StoreTimezoneServiceImpl implements StoreTimezoneService{
	@Autowired
    private StoreTimezoneDao dao;
    
    //constructor
	public StoreTimezoneServiceImpl()
	{
		
	}

	
	public String gettimezone()
	{
		
		String s = "5256640000000000";
		StoreTimezone t  = dao.findById("5256640000000000").get();
		System.out.println(t.getTimezone());
		return t.getTimezone();
	}
	
}
