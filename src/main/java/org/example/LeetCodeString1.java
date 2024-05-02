package org.example;

import java.util.*;

public class LeetCodeString1 {
    public static void main(String[] args) {

        String demoString = "qiwekiiroc";
        /*//find the length of the longest substring without repeating characters.*/
      /*  int output = nonRepeating(demoString);
        System.out.println("The count is " + output);

       */
        //remove duplicates from string and keep the order same
        String output = removeDups(demoString);
        System.out.println("Modified String is" + output);
    }

    private static int nonRepeating(String demoString) {
        char[] chars = demoString.toCharArray();

        int counter = 0;
        //Initialized left  pointer
        int k = 0;


        int maxCounter = 0;
        //Hashmap for the string

        //Basic logic - take 2 ptrs, use sliding window and keep the index of each character in particular substring inside hashMap


       Map<Character,Integer> countMap = new HashMap<>();



        //Hashmap Approach



            for (int j = 0;j<demoString.length();j++){

                if(countMap.containsKey(chars[j]) && countMap.get(chars[j])>=k ){
                    k = countMap.get(chars[j])+1;
                }

                countMap.put(chars[j], j);
                maxCounter = Math.max(maxCounter,j-k+1);
            }




        return maxCounter;
    }


    static String removeDups(String S) {
        // code here
        StringBuilder sb = new StringBuilder();
       // char[] chars = S.toCharArray();
        int j = 0;
        Set<Character>stringSet = new HashSet<>();
        for(int i = 0;i<S.length();i++){
            if(!stringSet.contains(S.charAt(i))){
                stringSet.add(S.charAt(i));
                sb.append(S.charAt(i));

            }

        }
        return sb.toString();
    }
}
