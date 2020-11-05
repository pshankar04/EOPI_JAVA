package com.test.epi;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToDecimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap<String,Integer> numberMap = new HashMap<String,Integer>();
		numberMap.put("M",1000);
		numberMap.put("D",500);
		numberMap.put("C",100);
		numberMap.put("L",50);
		numberMap.put("X",10);
		numberMap.put("V",5);
		numberMap.put("I",1);

		String str = ""; 

		do {
			str = input.nextLine();
			if(str.equals("0")) {
				break;
			}else {
				
				int number = 0;
				for(int i = 0  ; i < str.length() ; i++) {

					if(str.charAt(i) == 'I' && (i+1) < str.length() && numberMap.get(str.charAt(i+1)+"") > numberMap.get(str.charAt(i)+"")) {
						number += numberMap.get(str.charAt(i+1)+"") - numberMap.get(str.charAt(i)+"");
						i++;
					}else if(str.charAt(i) == 'X' && (i+1) < str.length() && numberMap.get(str.charAt(i+1)+"") > numberMap.get(str.charAt(i)+"")) {
						number += numberMap.get(str.charAt(i+1)+"") - numberMap.get(str.charAt(i)+"");
						i++;
					}else if(str.charAt(i) == 'C' && (i+1) < str.length() && numberMap.get(str.charAt(i+1)+"") > numberMap.get(str.charAt(i)+"")) {
						number += numberMap.get(str.charAt(i+1)+"") - numberMap.get(str.charAt(i)+"");
						i++;
					}else if(str.charAt(i) == 'D' && (i+1) < str.length() && numberMap.get(str.charAt(i+1)+"") > numberMap.get(str.charAt(i)+"")) {
						number += numberMap.get(str.charAt(i+1)+"") - numberMap.get(str.charAt(i)+"");
						i++;
					}
					else {
						number += numberMap.get(str.charAt(i)+"");
					}
				}

				System.out.println(number);
			}
		}while(!str.equals("0"));

		input.close();

	}

}
