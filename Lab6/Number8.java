
package Lab6;

import java.util.Arrays;
import java.util.Scanner;

public class Number8 {

	
	static boolean isAlphabaticOrder(String s) {
		
		int n = s.length();

		
		char c[] = new char[n];

		for (int i = 0; i < n; i++) {
			c[i] = s.charAt(i);
		}

		
		Arrays.sort(c);

		
		for (int i = 0; i < n; i++)
			if (c[i] != s.charAt(i))
				return false;

		return true;
	}

	public static void main(String args[]) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string-");
		s = sc.nextLine();
		
		if (isAlphabaticOrder(s))
			System.out.println("true");
		else
			System.out.println("false");

	}

}
