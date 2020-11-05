package com.test.epi;

import java.util.Scanner;

public class PalindromeTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String string = input.nextLine();
		if(isPalindrome(string)) {
			System.out.println("Its a Palindrome");
		}else {
			System.out.println("Its not a Palindrome");
		}
		input.close();

	}
	
	public static boolean isPalindrome(String str) {
		
		int i = 0 , j = str.length() - 1;
		
		while(i < j) {
			while(!Character.isLetterOrDigit(str.charAt(i)) && (i < j)) {
				++i;
			}
			
			while(!Character.isLetterOrDigit(str.charAt(j)) && (i < j)) {
				--j;
			}
			if(Character.toLowerCase(str.charAt(i++)) != Character.toLowerCase(str.charAt(j--))) {
				return false;
			}
		}
		return true;
	}

}
