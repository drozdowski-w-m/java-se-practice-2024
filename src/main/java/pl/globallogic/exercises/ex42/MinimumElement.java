package pl.globallogic.exercises.ex42;

import java.util.Scanner;
import java.util.Arrays;

public class MinimumElement {

    public static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of elements");
        int amount = scanner.nextInt();
        return amount;
    }

    public static int[] readElements(int amount){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter "+amount+" integers: ");
        int[] array = new int[amount];

        for (int i = 0; i < amount; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array){
        Arrays.sort(array);
        return array[0];
    }

    public static void main(String[] args){
        int[] array = readElements(readInteger());
        System.out.println("Min value is: "+findMin(array));
    }
}
