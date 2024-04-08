package pl.globallogic.exercises.ex28;

import java.lang.Math;
public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if ( width <= 0 || height <= 0 || areaPerBucket <=0 || extraBuckets < 0 )
            return -1;
        double totalArea = width * height;

        return (int)(Math.ceil(totalArea/areaPerBucket)-extraBuckets);

    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if ( width <= 0 || height <= 0 || areaPerBucket <=0 )
            return -1;
        double totalArea = width * height;

        return (int)(Math.ceil(totalArea/areaPerBucket));
    }

    public static int getBucketCount(double area,double areaPerBucket){
        if ( area <= 0 || areaPerBucket <= 0 )
            return -1;
        return (int)(Math.ceil(area/areaPerBucket));
    }

    public static void main(String[] args){
//tests
        System.out.println("4 params: ");
        System.out.print(getBucketCount(-3.4, 2.1, 1.5, 2)+" ");
        System.out.print(getBucketCount(3.4, 2.1, 1.5, 2)+" ");
        System.out.print(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println("\n3 params: ");
        System.out.print(getBucketCount(-3.4, 2.1, 1.5)+" ");
        System.out.print(getBucketCount(3.4, 2.1, 1.5)+" ");
        System.out.print(getBucketCount(7.25, 4.3, 2.35));
        System.out.println("\n2 params: ");
        System.out.print(getBucketCount(3.4, 1.5)+" ");
        System.out.print(getBucketCount(6.26, 2.2)+" ");
        System.out.print(getBucketCount(3.26, 0.75));
    }
}
