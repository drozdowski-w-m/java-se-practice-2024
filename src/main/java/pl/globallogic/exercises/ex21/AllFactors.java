package pl.globallogic.exercises.ex21;

public class AllFactors {

    public static void printFactors(int number){
        if ( number < 1 )
            System.out.println("Invalid value");
        else {
            for ( int i = 1 ; i <= number ; i++){
                if ( number % i == 0 )
                    System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
//tests
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }
}
