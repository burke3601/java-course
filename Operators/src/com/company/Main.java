package com.company;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
        System.out.println("1 + 2 =" + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3-1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("4 % 4 = " + result);

        // result = result + 1
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; //2-1=1
        System.out.println("2-1= " + result);
        result += 2;
        System.out.println("1+2= " + result);
        result *= 10;
        System.out.println("3 * 10 = " + result);
        result /= 3;
        System.out.println("3 / 3 = " + result);
        result -= 2;
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if(topScore <= 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar){
            System.out.println("this is not supposed to happen");
        }
        //! NOT operator aka logical complement operator

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }


        //code challenge
        double num1 = 20.00d;
        double num2 = 80.00d;
        double num3 = ((num1 + num2) * 89.00d );

        double num4 = num3 % 40.00d;
        System.out.println(num4);

        boolean remainderZero = (num4 == 0) ? true : false;
        System.out.println("remainderZero = " + remainderZero) ;

        if(!remainderZero){
            System.out.println("got some remainder");
        }




    }
}
