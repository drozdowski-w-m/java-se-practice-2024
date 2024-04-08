package pl.globallogic.exercises.ex27;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;

        while ( scanner.hasNextInt() ){
            int number = scanner.nextInt();
            sum += number;
            cnt++;
        }
        if ( cnt == 0 )
            System.out.println("SUM = 0 AVG = 0");
        else
            System.out.println("SUM = "+sum+" AVG = "+ (long)(sum/cnt));
    }
    public static void main(String[] args){
//tests
        inputThenPrintSumAndAverage();
    }
}
