package pl.globallogic.exercises.ex17;

public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        if ( number < 0 )
            return -1;

        String temp = String.valueOf(number);
        char val1 = temp.charAt(0);
        char val2 = temp.charAt(temp.length()-1);
        //System.out.println("V1: "+val1+" V2: "+val2);
        int sum = Character.getNumericValue(val1) + Character.getNumericValue(val2);

        return sum;
    }

    public static void main(String args[]){
//tests
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }


}
