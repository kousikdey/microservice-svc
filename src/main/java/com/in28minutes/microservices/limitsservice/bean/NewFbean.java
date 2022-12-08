package com.in28minutes.microservices.limitsservice.bean;

public class NewFbean {
	private int minimum;
	private int maximum;
	private String minimumText;
	private String maximumText;

	public NewFbean() {
		super();
	}

	public NewFbean(int minimum, int maximum) {
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

	public String getMinimumText() {
		return minimumText;
	}

	public void setMinimumText(String minimumText) {
		this.minimumText = minimumText;
	}

	public String getMaximumText() {
		return maximumText;
	}

	public void setMaximumText(String maximumText) {
		this.maximumText = maximumText;
	}

}
