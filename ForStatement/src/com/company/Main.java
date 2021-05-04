package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 2));
//        System.out.println("10,000 at 3% interest = " + calculateInterest(10000, 3));
//
//
//
//
//        for(int i = 2; i<9; i++){
//            System.out.println("10,000 at " + i+ "% interest = " + String.format("%.2f",calculateInterest(10000, i)));
//        }
//        System.out.println("*************************");
//        for(int i = 8; i>1; i--){
//            System.out.println("10,000 at " + i+ "% interest = " + String.format("%.2f",calculateInterest(10000, i)));
//        }
        int count = 0;
        for(int i=10; i<50; i++){
            if(isPrime(i)){
                count ++;
                System.out.println("Number " + i + " is prime");
                if(count == 10){
                    System.out.println("exiting the loop");
                    break;
                }
            }
        }

    }

    public static boolean isPrime(int n){

        if(n == 1){
            return false;
        }
        for(int i =2; i <= (long) Math.sqrt(n); i ++) {
            //System.out.println("Looping "+ i);
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

//    public static void primeCheck(int j, int k){
//        int count = 0;
//
//        for(int i = j; i >= j && i <= k; i ++ ){
//            count ++;
//            if(isPrime(i)){
//                System.out.println(i + " is prime");
//                if(count == 4){
//                    break;
//                }
//            }
//        }
//
//    }

    public static double calculateInterest(double amount, double interestRate){

        return(amount * (interestRate/100));

    }
}
