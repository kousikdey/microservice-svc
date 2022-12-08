package com.in28minutes.microservices.limitsservice.bean;

public class NewAddedNow {
	private int minimum;
	private int maximum;
	private String add;

	public NewAddedNow() {
		super();
	}

	public NewAddedNow(int minimum, int maximum) {
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

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

}
