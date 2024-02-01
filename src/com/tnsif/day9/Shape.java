package com.tnsif.day9;

abstract class Shape {
	   protected float area;
		//abstract method
		abstract void calArea();
		
		//concrete method
		void show()
		{
			System.out.println("area is" +area);
		}
	}