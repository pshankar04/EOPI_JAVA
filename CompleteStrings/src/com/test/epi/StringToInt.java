package com.test.epi;

import java.util.Scanner;

public class StringToInt {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String"+"\n");
		String str = input.nextLine();
		System.out.println("String to Integer: "+convertToInt(str));
		System.out.println("Enter the Integer"+"\n");
		int number = Integer.parseInt(input.nextLine());
		System.out.println("Integer to String: "+convertToString(number));
		input.close();
	}
	
	public static int convertToInt(String s) {
		int result = 0;
		for(int i = s.charAt(0) == '-' ? 1 : 0; i < s.length(); i++) {
			final int digit = s.charAt(i) - '0';
			result = result * 10 + digit;
		}
		
		return s.charAt(0) == '-' ? -result : result;
	}
	
	public static String convertToString(int num) {
		
		boolean isNegative = false;
		StringBuilder sb = new StringBuilder();
		if(num < 0) {
			isNegative = true;
		}
		do {
			sb.append((char) ('0' + Math.abs(num % 10)));
			num /= 10;
		}while (num != 0);
		
		if (isNegative) {
			sb.append('-');
		}
		sb.reverse();
		
		return sb.toString();
	}

}
