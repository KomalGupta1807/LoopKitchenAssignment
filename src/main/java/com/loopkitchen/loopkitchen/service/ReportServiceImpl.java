package com.loopkitchen.loopkitchen.service;
import java.util.UUID;
import com.loopkitchen.loopkitchen.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.loopkitchen.loopkitchen.entity.*;
import com.loopkitchen.loopkitchen.dao.ReportDao;


@Service
public class ReportServiceImpl implements ReportService{
	
	
	@Autowired
    private ReportDao reportdao;
    
    //constructor
    ReportServiceImpl()
    {
    	
    }
    
    public String randomNameGen()
    {
    	return UUID.randomUUID().toString().substring(0,20);
    }
    
    
    
    //get report id
    public String getReportId()
    {
    	String s = randomNameGen();
    	//System.out.println("report id is "+s);
    	Report r = new Report(s, "Running");
    	//System.out.println(r.getReportId());
    	//System.out.println(r.getStatus());

    	reportdao.save(r);
    	return s;
    }
    
    //getting report status
    public ReportParam getStatus(String id)
    {
    	//String s = getReportId();
    	Report r = reportdao.findById(id).get();
    	ReportParam rr = new ReportParam(r.getStatus());
    	System.out.println("status is hi"+rr.getval());
    	return rr;
    }	
}
