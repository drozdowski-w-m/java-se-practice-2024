package pl.globallogic.exercises.ex9;

import java.lang.Math;

public class AreaCalculator {

    public static double area(double radius){
        if (radius < 0) return -1;
        else return Math.PI*Math.pow(radius,2);
    }

    public static double area(double x, double y){
        if ( x < 0 || y < 0) return -1;
        else return x*y;

    }

    public static void main(String args[]){
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0,4.0));
        System.out.println(area(-1.0,4.0));
    }
}
