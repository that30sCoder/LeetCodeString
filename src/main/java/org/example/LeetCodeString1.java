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

        int counter = 0;
        //Initialized right pointer
        int k = 0;
        //Initialized left pointer
        int l = 0;

        int maxCounter = 0;
        //Hashmap for the string

        //Basic logic - take 2 ptrs, use sliding window and keep the index of each character in particular substring inside hashMap


       Map<Character,Integer> countMap = new HashMap<>();

        while (k<demoString.length()) {
            counter = 0;
            for (int j = k;j<demoString.length();j++){

                if(countMap.containsKey(chars[j]) && countMap.get(chars[j])>=k && countMap.get(chars[j])<=j){
                    maxCounter = Math.max(counter,maxCounter);
                    k = countMap.get(chars[j])+1;
                    countMap.clear();
                    break;
                }
                else {
                    countMap.put(chars[j], j);
                    counter++;
                }

            }

        }
        return Math.max(maxCounter,counter);
    }
}
