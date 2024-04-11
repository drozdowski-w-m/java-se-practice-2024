package pl.globallogic.sessions.challenges;

import java.util.Scanner;

import java.lang.Math;

public class SumOfDigits {
    public static int getDigitSum(int number){
        if ( number == 0 )
            return 1;
        int sum = 0;
        int tempNumber;
        while ( number > 0 ){
            tempNumber = number%10;
            sum += tempNumber;
            number = number/10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to sum it digits: ");
        while (scanner.hasNextInt()){

            System.out.println(getDigitSum(Math.abs(scanner.nextInt())));
        }
    }
}
