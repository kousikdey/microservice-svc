package com.in28minutes.microservices.limitsservice.bean;

public class MasterB {
	private int minimum;
	private int maximum;

	public MasterB() {
		super();
	}

	public MasterB(int minimum, int maximum) {
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

}
