package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome((12321)));
        System.out.println(isPalindrome((12345621)));
    }

    public static boolean isPalindrome(int number){
       int lastDigit;
       int reverse = 0;
       int num = number;

       while(num != 0){
           lastDigit=0;
           lastDigit= num % 10;
           reverse *= 10;
           reverse += lastDigit;
           num /= 10;
           System.out.println(reverse);
       }
       if(reverse == number) {
           return true;
       } else {
           return false;
       }

    }
}
