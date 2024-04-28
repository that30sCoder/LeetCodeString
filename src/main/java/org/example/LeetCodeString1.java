package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCodeString1 {
    public static void main(String[] args) {
        //find the length of the longest substring without repeating characters.
        String demoString = "pwwkew";
        int output = nonRepeating(demoString);
        System.out.println("The count is "+ output);
    }

    private static int nonRepeating(String demoString) {
        char[] chars = demoString.toCharArray();
        int count = 1;

        Map<Integer, List<Integer>> countMap = new HashMap<>();
        int i = 0;
        int j = 1;
        for(int k = 0;k<chars.length;k++){
            if(countMap.containsKey(chars[k])){

            }
        }
        while(i<j && j<chars.length){
            if(chars[i]!=chars[j] && (j-i)>(count -1)){
                count++;
                j++;
            }
            else
                i++;
        }
        return count;
    }
}
