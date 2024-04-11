package pl.globallogic.sessions.challenges;

import java.util.Scanner;
import java.lang.Math;

public class DigitCounter {
    public static int countDigits(int number){
        int counter = 0;
        if (number == 0 )
            return  counter+1;
        while ( number > 0 ){
            counter++;
            number = number/10;
        }
        return counter;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to count digits: ");
        int number = scanner.nextInt();
        System.out.println("Your number has "+countDigits(Math.abs(number))+" digits.");
    }
}
