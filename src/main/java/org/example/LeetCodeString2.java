package org.example;

public class LeetCodeString2 {
    public static void main(String[] args) {
        //Longest Palindromic Substring,default result should be one char
        String s = "ac";
        String response = longestPalindrome(s);
        System.out.println("Longest pallindromic substring is " + response);

    }

    public static String longestPalindrome(String s) {

        int i = 0;
        int j = s.length()-1;

        while(i<=j){
            int mid = i+ (j-i)/2 ;
            if((j-i)%2==0) {
                if (s.substring(i, mid + 1)
                        .equals(new StringBuilder(s.substring(mid, j + 1)).reverse().toString())) {
                    return s.substring(i, j + 1);
                }
            }
            else {
                if (s.substring(i, mid+1 )
                        .equals(new StringBuilder(s.substring(mid+1, j+1)).reverse().toString())) {
                    return s.substring(i, j + 1);
                }
            }
            i++;
            j--;
        }
        return s.substring(i);
    }
}
