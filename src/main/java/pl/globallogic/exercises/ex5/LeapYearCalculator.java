package pl.globallogic.exercises.ex5;

public class LeapYearCalculator {

    public static boolean isLeapYear(int year){
        if ( year < 1 || year > 9999 )
            return false;
        else {
            if ( year % 400 == 0  )
                return true;
            if ( year%100 == 0 )
                return false;
            return year%4 == 0;
        }
    }

    public static void main(String args[]){
//tests
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2020));

    }
}
