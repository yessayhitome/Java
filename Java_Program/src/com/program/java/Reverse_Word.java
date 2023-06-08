package com.program.java;

public class Reverse_Word {
	
	public static void main(String[] args) {
		
		reverse_Word();
		
		reverse_EachWord();
	}
	
	public static void reverse_Word() {
		
		String s = "Program";
		
		String reverse = " ";
		
		for (int i = s.length()-1;i>=0; i--) {
			
			reverse = reverse + s.charAt(i);
			
		}
		
		System.out.println("Reverse word = "+reverse);

	}
	
	public static void reverse_EachWord() {
		
		String s = "Reverse Each Word";
		
		String[] spl = s.split(" ");
		
		String reverse = " ";
		
		for (String x : spl) {
			
			String word = " ";
			
			for (int i = x.length()-1; i>=0; i--) {
				
				word = word + x.charAt(i);
				
			}
			
			reverse = reverse + word + " ";
		}
		
		System.out.println("Reverse Each Word = "+reverse);

	}

}
