package com.test.epi;

import java.util.Scanner;

public class ExcelNumberToColumnId {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		do {
			number = Integer.parseInt(input.nextLine());
			if(number == 0) {
				break;
			}else {
				System.out.println(retrieveTheId(number));
			}
		}while(number != 0);

		input.close();

	}

	
	public static String retrieveTheId(int num) {
		
		
	    int modulo = 0;
	    String str = ""; 
	    
		while(num != 0) {
			 modulo = (num - 1) % 26;
		     str =   (char)('A' + modulo) + str;
		     num = (int)((num - modulo) / 26);				
		}
		
		return str;

	}

}
