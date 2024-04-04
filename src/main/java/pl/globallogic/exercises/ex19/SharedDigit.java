package pl.globallogic.exercises.ex19;

public class SharedDigit {

    public static boolean hasSharedDigit(int a, int b){
        if ( a < 10 || a > 99 || b < 10 || b > 99 )
            return false;
        String intA = String.valueOf(a);
        String intB = String.valueOf(b);

        if ( intA.charAt(0) == intB.charAt(0) || intA.charAt(0) == intB.charAt(1) )
            return true;
        if ( intA.charAt(1) == intB.charAt(0) || intA.charAt(1) == intB.charAt(1) )
            return true;
        else
            return false;

    }
    public static void main(String args[]){
//tests
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
}
