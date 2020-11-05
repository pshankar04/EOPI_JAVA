package com.test.epi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class PhonePadMnuemonics {

	public static HashMap<String,ArrayList<String>> numberCharacterMap = new HashMap<String,ArrayList<String>>();
	public static ArrayList<String> stringCombinations;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String numberStr;	
		populateNumberMap();
		String character = "";
		do {
			numberStr = input.nextLine();
			if(numberStr.equals("1") || numberStr.equals("0")) {
				break;
			}else {
				stringCombinations = new ArrayList<String>();
				for(int i = 0 ; i  < numberStr.length() ; i++) {
					character = numberStr.charAt(i)+"";
					performCrossMultiplication(numberCharacterMap.get(character));
				}

				for(String str: stringCombinations) {
					System.out.println(str);
				}
			}
		}while(!numberStr.equals(0));
		input.close();
	}


	public static void performCrossMultiplication(ArrayList<String> charsList) {
		String interimStr = "";
		ArrayList<String> interimList = new ArrayList<String>();

		if(stringCombinations.size() > 0) {
			for(int k = 0 ; k < stringCombinations.size(); k++){
				for(String st: charsList) {
					interimStr = stringCombinations.get(k) + st;
					interimList.add(interimStr);
					interimStr = "";
				}
			}
			stringCombinations = interimList;
		}else {
			stringCombinations.addAll(charsList);
		}


	}

	public static void populateNumberMap() {

		numberCharacterMap.put(2+"", new ArrayList<String>(Arrays.asList("A","B","C")));
		numberCharacterMap.put(3+"", new ArrayList<String>(Arrays.asList("D","E","F")));
		numberCharacterMap.put(4+"", new ArrayList<String>(Arrays.asList("G","H","I")));
		numberCharacterMap.put(5+"", new ArrayList<String>(Arrays.asList("J","K","L")));
		numberCharacterMap.put(6+"", new ArrayList<String>(Arrays.asList("M","N","O")));
		numberCharacterMap.put(7+"", new ArrayList<String>(Arrays.asList("P","Q","R","S")));
		numberCharacterMap.put(8+"", new ArrayList<String>(Arrays.asList("T","U","V")));
		numberCharacterMap.put(9+"", new ArrayList<String>(Arrays.asList("W","X","Y","Z")));

	}


}
