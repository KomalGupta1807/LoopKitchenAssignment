package com.loopkitchen.loopkitchen.controller;

import java.util.List;
import com.loopkitchen.loopkitchen.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.loopkitchen.loopkitchen.entity.Report;
import com.loopkitchen.loopkitchen.service.MenuHoursService;
import com.loopkitchen.loopkitchen.service.ReportService;
import com.loopkitchen.loopkitchen.service.StoreService;
import com.loopkitchen.loopkitchen.service.StoreTimezoneService;
import com.loopkitchen.loopkitchen.entity.*;

@RestController
public class MyController {
    
	@Autowired
	private ReportService reportservice;
	@Autowired
	private StoreTimezoneService sts;
	@Autowired
	private MenuHoursService m;
	@Autowired
	private StoreService s;
	@GetMapping("/trigger_report")
	public String getReportId()
	{
		m.getValues();
		s.getValues();
		String s = this.reportservice.getReportId();
		 return s;
	}
	
	@GetMapping("/get_report/{reportId}")
	public ReportParam getStatus(@PathVariable String reportId)
	{
	    
	    ReportParam rr = this.reportservice.getStatus(getReportId());
	    System.out.println("status is "+rr.getval());
		return rr;
	}
	
	@GetMapping("/get")
	public String gettimezone()
	{
		return this.sts.gettimezone();
	}
	

}
