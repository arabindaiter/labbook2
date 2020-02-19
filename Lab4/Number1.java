package Lab4;

import java.util.Scanner;

public class Number1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scan.nextInt();
		int soq=SumOfCubes(n);
		System.out.println(soq);
	}

	private static int SumOfCubes(int n) {
		int sq=(n*(n+1))/2;
		int sq1=sq*sq;
		return sq1;
	}
}

