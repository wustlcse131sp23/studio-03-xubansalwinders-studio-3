package studio3;

import java.util.Scanner;

public class Sieve {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("What number?");
		int n = scan.nextInt();
		boolean [] prime = new boolean [n+1];

		for (int i=0; i<prime.length; i++) {
			prime[i]=true;
		}

		for (int j=2; j <= Math.sqrt(n); j++) {
			if (prime[j] == true) {
				for (int k = j*j; k < n+1; k = k+j) {
					prime [k] = false;
					System.out.println(prime[k] + " " + k);	

				}
			}
		}
		System.out.println("prime numbers are:");	
		for (int i = 2; i<=n; i++) {
			if(prime[i] == true) {
				System.out.println(i + "" + prime[i]);	
				
			}

		}



	}
}