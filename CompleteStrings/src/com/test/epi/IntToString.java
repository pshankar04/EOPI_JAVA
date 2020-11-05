package com.test.epi;

import java.util.Scanner;

public class IntToString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int number = Integer.parseInt(input.nextLine());
		System.out.println(convertToString(number));
		input.close();
	}

	public static String convertToString(int num) {
		boolean isNegative = false;
		if(num < 0) {
			isNegative = true;
		}
		StringBuilder s = new StringBuilder();
		do {
			s.append((char)('0' + Math.abs(num % 10)));
			num /= 10;
		}while(num != 0);
		
		if(isNegative) {
			s.append('-');
		}
		s.reverse();
		return s.toString();
	}
}
