package com.test.epi;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "madamimadam";
		
		if(isPalindrome(string)) {
			System.out.println("It is a Palindrome");
		}else {
			System.out.println("It is not a Palindrome");
		}
	}
	
	public static boolean isPalindrome(String s) {
		
		for(int i = 0, j = s.length() - 1; i < j; ++i, --j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}

}
