package Lab1;

import java.util.Scanner;


public class Number3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scan.nextInt();
		boolean check=checkNumber(n);
		if(check==true) {
		System.out.println("increasing");
		}
		else {
			System.out.println("decreasing");
		}
		
	}
	private static boolean checkNumber(int n) {
		boolean flag=false;
		while(n!=0) {
		int	cnum=n%10;
		int num=n/10;
		if(cnum>=(num%10)) {
			flag=true;
			n = num;
		}
		else {
			flag = false;
			break;
		}
		}
		return flag;
		
		}
	
	}

	
