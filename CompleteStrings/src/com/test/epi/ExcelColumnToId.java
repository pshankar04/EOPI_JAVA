package com.test.epi;

import java.util.Scanner;
import java.lang.Math;

public class ExcelColumnToId {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String column = input.nextLine().toLowerCase();
		do {
			int id = 0, diff = 0;
			int addendum = 26;
			if(column.length() == 1) {
				id = column.charAt(0) - 'a';
				System.out.println(id+1);
			}else{
				int i = 0;
//				for(int i = 0 ; i < column.length(); i++) {
				while(i < column.length()) {
					diff = (column.charAt(i) - 'a') == 0 ? 1 : (column.charAt(i) - 'a') + 1;
					if(i != column.length() - 1){
						id += (diff * (Math.pow(addendum,(i+1))));
					}else {
						id += diff;
					}
					i++;
				}
				System.out.println("For column "+column+" ID is "+id);
			}
			column = input.nextLine().toLowerCase();
		}while(!column.equals("--"));

		input.close();


	}

}
