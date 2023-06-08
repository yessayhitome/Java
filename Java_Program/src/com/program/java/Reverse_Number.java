package com.program.java;

public class Reverse_Number {
	
	public static void main(String[] args) {
		
		int given = 5123;
		
		int reverse = 0;
		
		while(given!=0) {
			
		reverse = reverse * 10;
		
		reverse = reverse + given % 10;
		
		given = given/10;
		
		}
		
		System.out.println("Reverse Number = "+reverse);
	}
	
	

}
