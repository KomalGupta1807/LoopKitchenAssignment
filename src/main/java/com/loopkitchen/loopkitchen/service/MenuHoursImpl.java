package com.loopkitchen.loopkitchen.service;

//sm
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loopkitchen.loopkitchen.dao.MenuhoursDao;
import com.loopkitchen.loopkitchen.entity.MenuHours;
import com.loopkitchen.loopkitchen.entity.menuHoursId1;

@Service
public class MenuHoursImpl implements MenuHoursService{
	@Autowired
	private MenuhoursDao d;
	
	//constructor
	MenuHoursImpl()
	{
		
	}   
	
	public void getValues()
	{
	   //  menuHoursId1 m = new menuHoursId1("7112029927194760000",2);
	  //   m.set_dayNo(2);
	  //   m.setStore_id("1481966498820150000");
		MenuHours mm = d.findById(new menuHoursId1("7112029927194760000",2)).get();
	//	System.out.println(mm.get));
		System.out.println(mm.getStartTime());
		System.out.println(mm.getEndTime());
		
		
		
	}
}
