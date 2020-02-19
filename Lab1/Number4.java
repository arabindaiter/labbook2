package Lab1;

import java.util.Scanner;

public class Number4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scan.nextInt();
		boolean check=checkNumber(n);
		if(check==true)
			System.out.println("number is a power of two");
		else
			System.out.println("number is not a power of two");

	}

	private static boolean checkNumber(int n) {
		while(n!=1) {
			if(n%2!=0)
				return false;
			n=n/2;
			}
				return true;
	}

}
