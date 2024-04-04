package pl.globallogic.exercises.ex6;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double a, double b){
        int resA = (int)(a*1000);
        int resB = (int)(b*1000);

        if ( resA == resB )
            return true;
        else
            return false;
    }



    public static void main(String args[]){
//tests

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175,3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));

    }
}
