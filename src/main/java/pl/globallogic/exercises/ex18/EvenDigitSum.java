package pl.globallogic.exercises.ex18;

import static pl.globallogic.exercises.ex15.SumOdd.isOdd;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number){
        if ( number < 0)
            return -1;
        int sum = 0;
        int tempNumber;
        while ( number > 0 ){
            tempNumber = number%10;
            if ( !isOdd(tempNumber) )
                sum += tempNumber;
            number = number/10;
        }
        return sum;
    }

    public static void main(String args[]){
//tests
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
}
