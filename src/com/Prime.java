package com.assignments;

public class Prime {

	public static void main(String[] args) {
		
		Prime prm = new Prime();
		prm.primeNumber(19);
	}

	void primeNumber(int n) {
		
		int remainderZero = 0;
		
		for(int i=0;i<=n;i++) {
			
			if(n%2 == 0) {
				remainderZero++;
			}
		}
		
		
		if(remainderZero > 2) {
			System.out.println(n+" is not a prime number");
		}else {
			System.out.println(n+" is a prime number");
		}
		
	}
}
