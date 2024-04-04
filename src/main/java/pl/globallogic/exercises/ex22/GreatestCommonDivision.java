package pl.globallogic.exercises.ex22;

public class GreatestCommonDivision {

    public static int gcd(int a, int b){
        if ( a < 10 || b < 10 ) {
            return -1;
        }

        while ( b != 0 ){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args){
//tests
        System.out.println(gcd(25, 15));
        System.out.println(gcd(12, 30));
        System.out.println(gcd(9, 18));
        System.out.println(gcd(81, 153));

    }
}
