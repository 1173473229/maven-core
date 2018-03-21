package org.ssh.services;

import java.util.List;

import org.ssh.pojo.Flight;

public interface FlightServices {

	List<Flight>select(String sql);


	
}
