package pl.globallogic.sessions.challenges;

public class PalindromeChecker {
    public static boolean isPalindrome(String text){
        StringBuffer buffer = new StringBuffer(text);
        String reversed = buffer.reverse().toString();

        return text.equals(reversed);
    }

    public static void main(String[] args) {
        String validInput = "ABBA";
        String invalidInput = "AB";
        System.out.println("is palindrome?: "+ isPalindrome(validInput));
        System.out.println("is palindrome?: "+ isPalindrome(invalidInput));
    }
}
