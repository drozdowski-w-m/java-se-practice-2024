package pl.globallogic.exercises.ex14;

import static pl.globallogic.exercises.ex5.LeapYearCalculator.isLeapYear;

public class NumberOfDaysInMonth {

    public static int getDaysInMonth(int month, int year){
        if ( month < 1 || month > 12 ) return -1;
        if ( year < 1 || year > 9999 ) return -1;
        else {

            switch (month) {
                case 1:
                    return 31;
                case 2:
                    if (isLeapYear(year)) return 29;
                    else return 28;
                case 3:
                    return 31;
                case 4:
                    return 30;
                case 5:
                    return 31;
                case 6:
                    return 30;
                case 7:
                    return 31;
                case 8:
                    return 31;
                case 9:
                    return 30;
                case 10:
                    return 31;
                case 11:
                    return 30;
                case 12:
                    return 31;
            }
        }
        return  -1;
    }


    public static void main(String args[]){
//tests
        System.out.println(getDaysInMonth(1,2020));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(getDaysInMonth(-1,2020));
    }
}
