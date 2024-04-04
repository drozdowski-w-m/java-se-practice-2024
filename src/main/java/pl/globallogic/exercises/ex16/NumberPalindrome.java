package pl.globallogic.exercises.ex16;

import java.lang.Math;

public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        StringBuffer buffer = new StringBuffer(String.valueOf(Math.abs(number)));
        String reversed = buffer.reverse().toString();

        return String.valueOf(Math.abs(number)).equals(reversed);
    }

    public static void main(String args[]){
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }
}
