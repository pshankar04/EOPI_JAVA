package com.test.epi;

import java.util.Scanner;

public class ArrayCharSubstitution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String[] strArray = input.nextLine().split(",");
		for(String a: strArray) {
			System.out.print(a);
		}
		
		int count = 0;
		for(int k = 0 ; k < strArray.length - 1 ; k++) {
			System.out.println(strArray[k]);
			if(strArray[k].equals("a")) {
				count += 2;
								System.out.println("1: "+count);

			}else if(strArray[k].equals("b")) {

//				count -= 1;
								System.out.println("2: "+count);
			}else {
				count += 1;
								System.out.println("3: "+count);

			}
		}

		String[] extendedArray = new String[count];
		int j = 0, i = 0;
				System.out.println("Count"+count);
		while (i < count) {
			if(strArray[i].equals("b")) {
				System.out.println("Here : b");
			}else if(strArray[i].equals("a")) {
				System.out.println("Here : a");
				extendedArray[j] = "d";
				extendedArray[j+1] = "d";
				j += 2;
			}else {
				if(i == strArray.length - 1) {
					break;
				}else {
					extendedArray[j] = strArray[i]+"";
					j += 1;
				}
			}
			i++;
			System.out.println(i+" : "+j);
			
		}
		for(String a: extendedArray) {
			System.out.print(a);
		}

		input.close();

	}

}
