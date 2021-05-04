package com.company;

public class Main {

    public static void main(String[] args) {
	    printNumberInWord(0);
	    printNumberInWord(1);
	    printNumberInWord(5);
	    printNumberInWord(-8);
    }

    private static void printNumberInWord(int num){
        switch (num){
            case 0:
                System.out.println("ZERO");
                break;

            case 1:
                System.out.println("ONE");
                break;

            case 2:
                System.out.println("TWO");
                break;

            case 3:
                System.out.println("THREE");
                break;

            case 4: case 5: case 6: case 7: case 8: case 9:
                System.out.println("number four - nine");
                break;

            default:
                System.out.println("no number print available");
                break;
        }
    }
}
