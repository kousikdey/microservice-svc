package com.in28minutes.microservices.limitsservice.bean;

public class Limits {
	private int minimum;
	private int maximum;
	
	private long longitude;
	private int longitude2;
	private int latitude;

	public Limits() {
		//added comments here - kd
		super();
	}

	public Limits(int minimum, int maximum) {
		//we will use this
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public long getLongitude() {
		return longitude;
	}

	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}
	
	public int getLongitude2() {
		return longitude2;
	}

	public void setLongitude2(int longitude2) {
		this.longitude2 = longitude2;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

}
