package com.program.java;

public class Swap_Number {
	
	public static void main(String[] args) {
		
		Swap_Number sn = new Swap_Number();
		
		sn.without_ThirdVariable();
		
		sn.with_Third();
		
	}
	
	int a = 20;
	
	int b = 30;
	
	public void without_ThirdVariable() {		
		
		a = a + b;
		
		b = a - b;
		
		a = a - b;
		
		System.out.println("Swap Number :"+ " Value of a = "+a+" Value of b = "+b);

	}
	
	public void with_Third() {
		
		int c;
		
		c = a;
		
		a = b;
		
		b = c;
		
		System.out.println("Swap Number :"+ " Value of a = "+a+" Value of b = "+b);


	}

}
