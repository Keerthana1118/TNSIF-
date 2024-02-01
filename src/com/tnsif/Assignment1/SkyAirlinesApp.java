package com.tnsif.Assignment1;

import java.util.Scanner;

public class SkyAirlinesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.nextLine();
		System.out.println("Enter source");
		String source=sc.nextLine();
		System.out.println("Enter destination");
		String destination=sc.nextLine();
		
		FormatProgram obj=new FormatProgram();
		obj.setName(name);
		obj.setSource(source);
		obj.setDestination(destination);
		
		String message=obj.generateMessage();
		System.out.println(message);
		
		sc.close();
		
		
		

	}

}
