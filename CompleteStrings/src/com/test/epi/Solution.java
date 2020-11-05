package com.test.epi;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static boolean solution(String s) {
        int oddCount = 0;
        
        Map<String,Integer> charCountMap = new HashMap<String,Integer>();
        for(int i = 0 ; i < s.length(); i++){
            if(charCountMap.containsKey(s.charAt(i)+"")){
                 charCountMap.put(s.charAt(i)+"",(charCountMap.get(s.charAt(i)+"")).intValue() + 1);                 
            }else{
                charCountMap.put(s.charAt(i)+"",(new Integer(1)).intValue());
            }
        }
        if(s.length() % 2 != 0){
            for (Map.Entry<String, Integer> entry : charCountMap.entrySet()) {
                Integer value = (Integer)entry.getValue();
                if (value % 2 != 0){
                     oddCount += 1; 
                }
            }
            if( oddCount == 1){
                 return true;   
            }else{
                 return false;   
            }
                
        }else{
            for (Map.Entry<String, Integer> entry : charCountMap.entrySet()) {
                Integer value = (Integer)entry.getValue();
                if (value % 2 != 0){
                     oddCount += 1; 
                }
            }
            if(oddCount == 0){
                return true;
            }else{
              return false;   
            }
        }
    }


public static void main(String[] args) {
	System.out.println(solution("carraec"));
	
}
}
