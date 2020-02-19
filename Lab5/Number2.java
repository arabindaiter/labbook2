package Lab5;

import java.util.Scanner;

public class Number2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0,b=1,c=0,n;
		System.out.println("Enter value of n:");
		n=sc.nextInt();
		System.out.print(a);
		System.out.print(b);
		for(int i=0;i<n-2;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(+c);
		}
		System.out.println();
		System.out.print(n+"th value of the series is: "+c);
	}

	}


