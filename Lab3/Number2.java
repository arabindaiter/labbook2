package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Number2 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter length");
		int n=scan.nextInt();
		String s[]=new String[n]; 
		System.out.println("enter string");
		for(int i=0;i<n;i++)
		{
			s[i]=scan.next();
		}
		System.out.println(Arrays.toString(Sorting(s,n)));  
	}

	private static String[] Sorting(String[] s, int n) {
		String c[]=new String[n];
		for (int i = 0; i < n; i++) 
        {
            for (int j = i+1; j < n; j++) 
            { 
                if (s[i].compareTo(s[j]) > 0) 
                {
                   String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
		int y=n/2;
		if(n%2==0)
		{
			
		for (int i = 0; i < y; i++)
		{
			c[i]=s[i].toUpperCase();
		}
		for (int i = y; i <n; i++) 
		{
			c[i]=s[i].toLowerCase();
		}
		}
		else {
			for (int i = 0; i < (y)+1; i++)
			{
				c[i]=s[i].toUpperCase();
			}
			for (int i = (y)+1; i <n; i++) 
			{
				c[i]=s[i].toLowerCase();
			}
		}
		return c;  
		
	}

	
	}

