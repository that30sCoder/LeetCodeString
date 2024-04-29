package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCodeString1 {
    public static void main(String[] args) {
        //find the length of the longest substring without repeating characters.
        String demoString = "pwwkew";
        int output = nonRepeating(demoString);
        System.out.println("The count is " + output);
    }

    private static int nonRepeating(String demoString) {
        char[] chars = demoString.toCharArray();
        int count = 1;
        char aChar = chars[0];

        Map<Character,int[]> countMap = new HashMap<>();
        int counter = 0;

        for (int k = 0; k < chars.length; k++) {
                if(countMap.containsKey(chars[k]) ){

                    countMap.put(chars[k], new int[]{k - countMap.get(chars[k])[0], k - countMap.get(chars[k])[1]});
                    counter = counter<countMap.get(chars[k])[1]?countMap.get(chars[k])[1]:counter;
                }
                else{
                    countMap.put(chars[k], new int[]{k,  k});
                }

        }
        return counter;
    }
}
