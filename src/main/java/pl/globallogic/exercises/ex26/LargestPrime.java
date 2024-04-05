package pl.globallogic.exercises.ex26;

public class LargestPrime {

    public static int getLargestPrime(int number){
        if ( number <= 1 )
            return -1;
        int factor = 2;
        while ( factor * factor <= number ){
            if ( number % factor == 0 )
                number /= factor;
            else
                factor++;
        }
        return number;
    }

    public static void main(String[] args){
//tests
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }
}
