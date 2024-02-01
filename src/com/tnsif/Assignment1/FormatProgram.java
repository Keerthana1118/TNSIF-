package com.tnsif.Assignment1;

public class FormatProgram {
	private String name;
	private String source;
	private String destination;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setSource(String source) {
		this.source=source;
	}
	public void setDestination(String destination) {
		this.destination=destination;
	}
	public String generateMessage() {
		return "Dear "+ name +" ,welcome onboard with service from " + source + " to " +destination+ ".Thank you for choosing Sky Airlines.Enjoy your flight!";
	}

}
