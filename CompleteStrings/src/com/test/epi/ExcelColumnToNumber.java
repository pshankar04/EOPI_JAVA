package com.test.epi;

import java.util.Scanner;

public class ExcelColumnToNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String column;
		do {
			column = input.nextLine();
			if(column.equals("--")) {
				break;
			}
			System.out.println(retrieveTheNumber(column));
		}while(!column.equals("--"));
		
		input.close();

	}

	public static int retrieveTheNumber(String col) {
		int result = 0;
		for(int i = 0; i < col.length(); i++) {
			char c = col.charAt(i);
			result = result * 26 + c - 'A' + 1;
		}
		return result;
	}

}
