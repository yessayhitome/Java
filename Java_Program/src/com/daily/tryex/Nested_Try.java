package com.daily.tryex;

public class Nested_Try {
	
	public static void main(String[] args) {
		
		int a = 0;
		
		int b[] = {2,6,8};
		
		try {
			System.out.println(10/a);
			
			try {
				System.out.println(b[5]);
			} 
			
			catch (ArrayIndexOutOfBoundsException e) {
				
				System.out.println("Array exception handle done");
			}
		}
		
		catch (ArithmeticException e) {
			System.out.println("Arimethic Exception Handle successfully");
		}
		
	}

}
