package com.tnsif.day10.Instanceofint;

public class phoneFactory {
	public static phone createPhone(String company) {
		if (company.equalsIgnoreCase("Samsung"))
			return new Samsung();
		else if (company.equalsIgnoreCase("Jio"))
			return new jio();
		return null;
	}
}
