package activities;

import java.util.*;

public class plane {
	private List<String> passengers;
	private int maxPassengers;
	private Date lastTimeTookof;
	private Date lastTimeLanded;
	
	//Initialize the constructor
	public plane(int maxPassenger) {
		this.maxPassengers = maxPassenger;
		this.passengers = new ArrayList<>();
	}
	
	//initiate method to onboard the passengers
	public void onboard(String passenger) {
		this.passengers.add(passenger);
	}
	
	//initiate method to know the LastTimeTakeof
	public Date getLastTimeTakeof() {
		this.lastTimeTookof = new Date();
		return lastTimeTookof;
	}
	
	//initiate a method to land
	public void land() {
		this.lastTimeLanded = new Date();
		this.passengers.clear();
	}
	
	//initiate a method to getLastTimeLanded
	public Date getLastTimeLanded() {
		return lastTimeLanded;
	}
	
	//initiate a list to collect the passengers list
	public List<String> getPassengers(){
		return passengers;
	}

}
