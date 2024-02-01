package com.tnsif.Assignment1;

import java.util.Scanner;

public class SmallestNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		String result=findSmallest(num1,num2,num3);
		System.out.println(result);
		
		
	}
	private static String findSmallest(int num1,int num2,int num3) {
		int smallest=(num1<num2)?(num1<num3?num1:num3):(num2<num3?num2:num3);
		
		if(num1==num2&&num2==num3) {
			return "All numbers are equal";
		}else {
			return "The smallest number is:"+smallest;
		}
	}

}
