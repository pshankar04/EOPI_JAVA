package com.test.epi;

import java.util.Scanner;

public class AngluarBrace {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s;
		do {
			s = input.nextLine();
			if(s.equals("0")) {
				break;
			}else {
				System.out.println(solution(s));
			}
		}while(!s.equals("0"));
		
		input.close();
	}
	
	public static String solution(String s) {
		int openCount = 0;
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < s.length() ; i++) {
			if(i == 0 && s.charAt(i) == '>') {
				sb.append("<");
				sb.append(s.charAt(i)+"");
			}else if(i > 0 && s.charAt(i) == '>') {
				if(openCount > 0) {
					openCount -= 1;
					sb.append(s.charAt(i)+"");
				}else {
					sb.append("<");
					sb.append(s.charAt(i)+"");
				}
			}else if(s.charAt(i) == '<') {
				sb.append(s.charAt(i)+"");
				openCount += 1;
			}
		}
		
		for(int j = 0 ; j < openCount ; j++) {
			sb.append(">");
		}
		
		return sb.toString();
		
	}

}
