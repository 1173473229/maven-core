package org.ssh.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Flight {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer flightID;
	@ManyToOne()
	private City startCityID;
	@ManyToOne
	private City endCityID;
	private String StartTime;
	public Integer getFlightID() {
		return flightID;
	}
	public void setFlightID(Integer flightID) {
		this.flightID = flightID;
	}
	
	public String getStartTime() {
		return StartTime;
	}
	public void setStartTime(String startTime) {
		StartTime = startTime;
	}
	public City getStartCityID() {
		return startCityID;
	}
	public void setStartCityID(City startCityID) {
		this.startCityID = startCityID;
	}
	public City getEndCityID() {
		return endCityID;
	}
	public void setEndCityID(City endCityID) {
		this.endCityID = endCityID;
	}

	
}
