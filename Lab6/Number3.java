package Lab6;

import java.util.*;

public class Number3 {

	public static String getImage(String s) {
		return new StringBuilder(s).reverse().toString();
	}

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string-");
		s = sc.nextLine();
		String temp=s;
		s = getImage(s);
		String s2= temp+ '|'+s;
		System.out.println("Output : " + s2);
	}
}