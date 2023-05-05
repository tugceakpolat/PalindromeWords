package com.example.palindromewords;

public class PalindromeWords {

    public static boolean isPalindrome (String word){
        String reverse  = "";
        for(int i = word.length() - 1; i >= 0; i--){
            reverse +=word.charAt(i);

        }
        return word.equals(reverse);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("kayak"));

    }
}
