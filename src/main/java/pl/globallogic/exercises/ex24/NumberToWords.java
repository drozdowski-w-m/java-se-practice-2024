package pl.globallogic.exercises.ex24;

public class NumberToWords {

    public static void numberToWords(int number){
        if ( number < 0 ){
            System.out.println("Invalid value");
        } else {
            int howManyDigits = getDigitCount(number);

            boolean zeroFlag = false;

            number = reverse(number);
            int diff = howManyDigits - getDigitCount(number);
            if ( howManyDigits != getDigitCount(number))
                zeroFlag = true;

            String sentence = "";
            while ( number > 0 ){
                int temp = number%10;
                sentence += vocabulary(temp);
                number = number / 10;
            }
            if ( zeroFlag ) {
                for (int i = 0 ; i < diff ; i++){
                    sentence += "ZERO ";
                }
            }
            System.out.println(sentence);
        }
    }

    public static int getDigitCount(int digit){
        if (digit < 0)
            return -1;
        if ( digit == 0 )
            return 1;
        int counter = 0;
        while ( digit != 0){
            counter += 1;
            digit = digit / 10;
        }
        //System.out.println("Counter: "+ counter);
        return counter;
    }

    public static int reverse(int number){
        int rev = 0;

        while ( number != 0 ){
            rev = rev * 10 + number % 10;
            number = number / 10;
        }
        return rev;
    }

    public static String vocabulary(int value){
        switch (value){
            case 0: return "ZERO ";
            case 1: return "ONE ";
            case 2: return "TWO ";
            case 3: return "THREE ";
            case 5: return "FIVE ";
            case 4: return "FOUR ";
            case 6: return "SIX ";
            case 7: return "SEVEN ";
            case 8: return "EIGHT ";
            case 9: return "NINE ";
            default: return "Invalid value";
        }
    }
    public static void main(String[] args){
//tests
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));

        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }
}
