package pl.globallogic.exercises.ex1;

import java.util.Random;

public class CheckNumber {
    public static void checkNumber(int number){
        if (number > 0) {
            System.out.println("positive");
        } else if ( number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

    public static void main(String args[]){

        Random rand = new Random();
        int randInt = rand.nextInt(100);
        checkNumber(randInt);
    }

}
