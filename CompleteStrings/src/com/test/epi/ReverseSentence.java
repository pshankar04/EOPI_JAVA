package com.test.epi;

import java.util.Scanner;

public class ReverseSentence {
	
	public static void main(String[] argsd) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		
		System.out.println(reverse(sentence));
		input.close();
	}
	
	public static String reverse(String sentence) {
		
		String[] sentenceArray = sentence.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int j = sentenceArray.length - 1 ; j >= 0 ; j--) {
			sb.append(sentenceArray[j] + " ");
		}
		
		return sb.toString();
		
	}

}
