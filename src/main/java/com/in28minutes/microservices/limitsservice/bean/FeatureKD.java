package com.in28minutes.microservices.limitsservice.bean;

public class FeatureKD {
	private int minimum;
	private int maximum;
	
	private String minimumT;
	private String maximumT;

	public FeatureKD() {
		super();
	}

	public FeatureKD(int minimum, int maximum) {
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
	
	public String getMinimumT() {
		return minimumT;
	}

	public void setMinimumT(String minimumT) {
		this.minimumT = minimumT;
	}

	public String getMaximumT() {
		return maximumT;
	}

	public void setMaximumT(String maximumT) {
		this.maximumT = maximumT;
	}

}