package com.company;
//method overloading is common in java
//improves code readibility and reusability
// it is easier to remember one method name instead of remembering multiple names
// achieves consistency in naming. One name for methods that are commonly used for example println.
//overload methods give programmers the flexibility to call a similar methods with differnt data types
public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Will", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        double centimeters = calcFeetAndInchesToCentimeters(6,-13);
        if(centimeters<0.0){
            System.out.println("invalid parameters");
        }

        calcFeetAndInchesToCentimeters(157);
    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    //can change the number of parameters
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score.");
        return 0;
    }
    //can't just change data type
//    public static void calculateScore(){
//        System.out.println("No player name, no player score.");
//
//    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet < 0 || (inches< 0 || inches > 12)){
            System.out.println("invalid feet or inches in parameter");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet," + inches + " inches = "
                + centimeters + " cm");
        return centimeters;
    }


    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet +
                " feet and " + remainingInches);
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }





}
