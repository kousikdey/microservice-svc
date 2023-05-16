package com.in28minutes.microservices.limitsservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {
	private long minimum;
	private long maximum;
	private int maximumMaster;
	private int maximum2;

	public long getMinimum() {
		return minimum;
	}

	public void setMinimum(long minimum) {
		this.minimum = minimum;
	}
	
	public int getMaximum2() {
		return maximum2;
	}

	public void setMaximum2(int maximum2) {
		this.maximum2 = maximum2;
	}

	public long getMaximum() {
		return maximum;
	}

	public void setMaximum(long maximum) {
		this.maximum = maximum;
	}
	
	public long getMaximumMaster() {
		return maximumMaster;
	}

	public void setMaximumMaster(int maximumMaster) {
		this.maximumMaster = maximumMaster;
	}

}
