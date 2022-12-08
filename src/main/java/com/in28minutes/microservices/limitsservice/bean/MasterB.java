package com.in28minutes.microservices.limitsservice.bean;

public class MasterB {
	private int minimum;
	private int maximum;
	
	private String minimumT;
	private String maximumT;

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

	public void setMaximumT(int maximumT) {
		this.maximumT = maximumT;
	}
	
	public String getMinimumT() {
		return minimumT;
	}

	public void setMinimumT(String minimumT) {
		this.minimum = minimum;
	}

	public String getMaximumT() {
		return maximumT;
	}

	public void setMaximumT(String maximumT) {
		this.maximumT = maximumT;
	}

}
