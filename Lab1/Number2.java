package Lab1;

import java.util.Scanner;

public class Number2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scan.nextInt();
		int difference=calculateDifference(n);
		System.out.println(difference);
	}

	private static int calculateDifference(int n) {
		int isum,wsum=0,sum=0;
		for (int i=1;i<=n;i++) {
			sum+=i;
			wsum+=(i*i);
		}
		isum=(sum*sum);
		System.out.println(isum);
		System.out.println(wsum);
		return Math.abs(isum-wsum);
		
	}

}
