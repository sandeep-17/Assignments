package com.assignments;

public class SimpleInterest {

	public static void main(String[] args) {
		
		
		
		SimpleInterest intrst = new SimpleInterest();
		intrst.simpleInterest(10000f,24f,2.5f);

	}
	
	void simpleInterest(float p, float n, float r) {
		
		System.out.println(p*n*r/100);
		
	}

}
