package Lab1;

import java.util.Scanner;

public class Number1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scan.nextInt();
		int sum=calculateSum(n);
		System.out.println(sum);

	}

	private static int calculateSum(int n) {
		int last=0;
		for (int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0){
			last=last+i;
				
			}
		}
		return last;
	}

}
