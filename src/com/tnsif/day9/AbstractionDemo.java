package com.tnsif.day9;

public class AbstractionDemo {
public static void main(String[] args) {
		
		Shape shape ;
		
		shape = new Rectangle(3.7f,4.5f);
		shape.calArea();
		shape.show();
		
		shape = new Square(2.0f);
		shape.calArea();
		shape.show();


		
	}

}
