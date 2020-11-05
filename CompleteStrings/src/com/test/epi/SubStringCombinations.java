package com.test.epi;

import java.util.ArrayList;
import java.util.Scanner;

public class SubStringCombinations {

	public static ArrayList<String> al;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String s;
		do {
			s = input.nextLine();
			if(s.equals("0")) {
				break;
			}else {
				al = new ArrayList<String>();
				findsubsequences(s, "");  
				System.out.println(al);
			}

		}while(!s.equals("0"));

		input.close();

	} 

	private static void findsubsequences(String s, String ans) 
	{ 
		if (s.length() == 0) { 
			al.add(ans); 
			return; 
		} 

		findsubsequences(s.substring(1), ans + s.charAt(0)); 

		findsubsequences(s.substring(1), ans); 
	}

}
