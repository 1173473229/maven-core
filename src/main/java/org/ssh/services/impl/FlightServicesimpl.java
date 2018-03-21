package org.ssh.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.ssh.dao.FlightDao;
import org.ssh.pojo.Flight;
import org.ssh.services.FlightServices;


@Service
@Transactional
public  class FlightServicesimpl  implements FlightServices{

	@Resource
	private FlightDao fd;
	
	
	@Override
	public List<Flight> select(String sql) {
	
		List<Flight> list = fd.select(sql);
		return list;
		
	}

}
