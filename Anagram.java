package javaAssignment;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a=0,b=0;
		
		String str = sc.next();
		String str1 = sc.next();
		
		char []st = str.toCharArray();
		char []st1 = str1.toCharArray();
		
		for(int i=0;i<st.length;i++) {
			a = st[i]+a;
		}
		for(int i=0;i<st.length;i++) {
			b = st1[i]+b;
		}
		
		if(a==b)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		sc.close();
		
	}

}