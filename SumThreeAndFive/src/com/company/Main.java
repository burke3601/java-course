package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
	    for(int i = 1; i <= 100; i ++){
	        if(i % 15 == 0){
	            count ++;
	            sum += i;
                System.out.println(i + " is divisible by 3 and 5");

            }
            if(count ==5){
                System.out.println("leaving the loop");
                break;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
