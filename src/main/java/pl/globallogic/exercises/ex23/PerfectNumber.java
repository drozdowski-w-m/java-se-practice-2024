package pl.globallogic.exercises.ex23;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number){
        if ( number < 1 )
            return false;

        int sum = 0;
        for ( int i = 1 ; i < number ; i++){
            if ( number % i == 0 )
                sum += i;
        }
        if ( sum == number )
            return true;
        else
            return false;
    }
    public static void main(String[] args){
//tests
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

    }
}
