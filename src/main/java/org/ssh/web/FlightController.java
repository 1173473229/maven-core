package org.ssh.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.ssh.pojo.Flight;
import org.ssh.services.FlightServices;

@Controller
public class FlightController {

	@Resource
	private FlightServices fs;
	
	@RequestMapping("/list")
	private String fn1(ModelMap map){
		
		String sql = " select * from flight ";
	List<Flight> list = fs.select(sql);
		
	map.put("list", list);
		return "flist";
	};
	
}
