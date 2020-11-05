package com.test.epi;

import java.util.Scanner;

public class LookNSay {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = "1";
		int number = Integer.parseInt(input.nextLine());
		for(int i = 1 ; i < number ; i++) {
			s = nextNumber(s);
		}
		System.out.println(s);
		input.close();
		

	}
	
	public static String nextNumber(String str) {
		
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for(int j = 0 ; j < str.length(); j++) {
			while((j+1) < str.length() && str.charAt(j) == str.charAt(j+1)) {
				j++;
				count++;
			}
			sb.append(count);
			sb.append(str.charAt(j));
		}
		return sb.toString();
	}
}
