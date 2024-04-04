package pl.globallogic.exercises.ex15;

public class SumOdd {

    public static boolean isOdd(int number){
        if (number < 1){
            //throw new IllegalArgumentException("Value must be greater than 0");
            return false;
        }
        if (number%2 == 0)
            return false;
        else
            return true;
    }

    public static int sumOdd(int start, int end){
        if ((start < 1 || end < 1) ){
            //throw new IllegalArgumentException("Value must be greater than 0");
            return -1;
        }
        if ( end < start )
            return -1;
        int sum = 0;
        for ( int i=start ; i<=end ; i++){
            if ( isOdd(i) )
                sum += i;
        }
       return sum;
    }

    public static void main(String args[]){
//tests
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }
}
