package com.company;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 400;
	    int levelCompleted = 5;
	    int bonus = 100;

//	    int scoreTwo = 10000;
//	    int levelCompletedTwo = 8;
//	    int bonusTwo = 200;

//	    if(score < 5000 && score >1000){
//            System.out.println("Your score was less than 5000");
//        } else if(score <1000){
//            System.out.println("your score was less than 1000");
//        }
//	    else {
//            System.out.println("got here");
//        }

        if(gameOver){ //equivalent to gameOver == true
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
            //finalScore does not have scope outside of this codeblock
        }
    //quicker but doesn't create a permanent tracker of variables
        score = 400;
        levelCompleted = 5;
        bonus = 100;

        if(gameOver){ //equivalent to gameOver == true
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
            //finalScore does not have scope outside of this codeblock
        }

//        if(gameOver){ //equivalent to gameOver == true
//            int finalScore = scoreTwo + (levelCompletedTwo * bonusTwo);
//            System.out.println("your final score was " + finalScore);
//            //finalScore does not have scope outside of this codeblock
//        }




	    //braces not necessary with  only one condition
        //only one line without a codeblock will be read

    }
}
