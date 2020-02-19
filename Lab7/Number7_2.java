package Lab7;

import java.util.HashMap;

public class Number7_2 {
	static final int MAX_CHAR = 256; 

	static HashMap<Character, Integer> countCharacter(char[] c) 
	{  
		int count[] = new int[MAX_CHAR]; 
		HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
		int len = c.length; 

		 
		for (int i = 0; i < len; i++) 
			count[c[i]]++; 
		System.out.println(count[c[len-3]]);
		
		char ch[] = new char[c.length]; 
		for (int i = 0; i < len; i++) { 
			ch[i] = c[i]; 
			int find = 0; 
			for (int j = 0; j <= i; j++) { 

				 
				if (c[i] == ch[j])  
					find++;                 
			} 

			if (find == 1)  {
				System.out.println("Number of Occurrence of " + 
						c[i] + " is:" + count[c[i]]);    
				hMap.put(c[i],count[c[i]]);
			}     
		}
		return hMap; 
	} 
	public static void main(String[] args) 
	{ 
		char c[]= {'A','P','P','L','E'};
		HashMap<Character, Integer> hMap=countCharacter(c); 
		System.out.println(hMap);
		
	}
}
