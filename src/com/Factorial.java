package com.assignments;

public class Factorial {

	public static void main(String[] args) {
		
		Factorial fact = new Factorial();
		fact.factorialmethod(6);

	}
	
	void factorialmethod(int n) {
		
		int finalvalue = 1;
		for(int i=n;i>=1;i--) {
			finalvalue = i*finalvalue;
		}
		System.out.println(finalvalue);
	}

}
