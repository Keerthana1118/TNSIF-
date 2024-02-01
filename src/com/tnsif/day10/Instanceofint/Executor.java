package com.tnsif.day10.Instanceofint;

public class Executor {
public static void main(String args[]) {
		
		phone p1 = phoneFactory.createPhone("Samsung"); 
		p1.call();
		p1.sms();
		
		p1 = phoneFactory.createPhone("Jio"); 
		p1.call();
		p1.sms();
		
	}

}
