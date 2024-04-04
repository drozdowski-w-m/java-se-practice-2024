package pl.globallogic.exercises.ex10;

public class MinutesToYearsAndDaysCalculator {

    public static void printYearsAndDays(long minutes){
        if (minutes < 0) System.out.println("Invalid value");
        else {
            long day = (minutes % 525600) / 1440;
            long year = minutes / 525600;
            System.out.println(minutes + " min = " + year + " y and " + day + " d");
        }
    }

    public static void main(String args[]){
//tests
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
}
