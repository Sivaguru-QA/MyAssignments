package assignment;

public class IsPrime {

	public static void main(String[] args) {
		
		int num = 13;
		boolean prime = true;
		
		if (num < 2) {
			prime = false;
			
		} else {
			for (int i = 2; i < num; i++) {
				
				if (num%i==0) {
					prime = false;
					break;
					
				}
				
			}

		}
		if (prime) {
			System.out.println(num + " is a prime" );
			
		} else {
			System.out.println(num + " is not aprime" );

		}
				
		}
		
	
	}

