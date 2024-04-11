package pl.globallogic.sessions.challenges;

import java.awt.*;

public class PowerOfNumberCalculator {

    public static long riseToPower(int number, int degree){
        long result = 1;
        if ( degree == 0 )
            return result;
        for (int i = 1; i <= degree; i++)
            result = result * number;
        return result;
    }

    public static double riseToPower(double number, int degree){
        double result = 1;
        if ( degree == 0 )
            return result;
        for (int i = 1; i <= degree; i++)
            result = result * number;
        return result;
    }

    public static long riseToPower(int number){
        return riseToPower(number, number);
    }
    public static void main(String[] args){
        int number = 2;
        int degree = 4;

        System.out.println("3 to power of 2 equals "+riseToPower(3,2));
        System.out.println("5 to power of 2 equals "+riseToPower(5,2));
        System.out.println(number+" to power of "+degree+" equals "+riseToPower(number,degree));
        System.out.println(riseToPower(3));
        System.out.println(riseToPower(2,1));
        System.out.println(riseToPower(2,0));
        System.out.println(riseToPower(1.2,2));


    }
}
