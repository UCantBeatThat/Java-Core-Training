package com.training.models;

import com.training.ifaces.Converter;

public class TemperatureConverter implements Converter {
	
	private double celcius;
	
	public TemperatureConverter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TemperatureConverter(double celcius) {
		super();
		this.celcius = celcius;
	}

	public double getCelcius() {
		return celcius;
	}

	public void setCelcius(double celcius) {
		this.celcius = celcius;
	}

	@Override
	public double convert() {
		// TODO Auto-generated method stub
		return (this.celcius*9/5) + 32;
	}

}
