package algorithms;

import javax.swing.JOptionPane;

public class Prime_Or_Not {

	public static void main(String[]args) {
		String num=JOptionPane.showInputDialog(null,"Tell me a number, any number");
		int prime=Integer.parseInt(num);
		int isprime=0;
		
		for(int i=2;i<prime;i++) {
			if(prime%i==0) {
				System.out.println(prime+" is not prime because it is divisible by "+i);
			}else {
			isprime++;
			}
			
		}
		if(isprime==prime-2) {
			System.out.println(prime+", the number is prime");
		}
	}
	}

