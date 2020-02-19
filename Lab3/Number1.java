package Lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Number1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length of the array");
		int n=scan.nextInt();
		int ss[]=new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++) {
			ss[i]=scan.nextInt();
		}
			int smno=getSecondSmallest(ss,n);
			System.out.println(smno);
	}

	private static int getSecondSmallest(int[] ss, int n) {
		List<Integer> list=new ArrayList<>();  
		for (Integer added : ss) 
		{
			list.add(added);  //adding from array to list
		}
		Collections.sort(list);  
		int secondSmallest=list.get(1);  
		return secondSmallest;  
		
	}

	

}
