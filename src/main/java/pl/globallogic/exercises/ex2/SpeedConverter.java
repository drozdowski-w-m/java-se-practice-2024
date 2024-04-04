package pl.globallogic.exercises.ex2;

import java.lang.Math;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){

        if (kilometersPerHour < 0) return -1;

        double mph  = 0.6214 * kilometersPerHour;

        return (Math.round(mph*100)/100);
    }

    public static void printConverter(double kilometersPerHour){
        if (kilometersPerHour < 0)
            System.out.println("Invalid value");
        else
            System.out.println(kilometersPerHour+" km/h = "+toMilesPerHour(kilometersPerHour)+" mi/h");
    }

    public static void main(String args[]){
//tests
        double testValues[] = {1.7, 10.25, -5.6, 25.42, 75.144};

//testing toMilesPerHour()
        for ( int i = 0 ; i < testValues.length ; i++){
            System.out.println("Miles: "+toMilesPerHour(testValues[i]));
        }

//testing printConverter()
        for (int i = 0 ; i < testValues.length ; i++){
            printConverter(testValues[i]);
        }
    }
}
