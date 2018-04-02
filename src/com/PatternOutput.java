package com.assignments;

public class PatternOutput {

	public static void main(String[] args) {
		
		PatternOutput ptrn = new PatternOutput();
		ptrn.patternMethod(6);
	}
	
	void patternMethod(int n) {
		
		for(int i =1;i<=n;i++) {
			System.out.print(i);
		}
	}

}
