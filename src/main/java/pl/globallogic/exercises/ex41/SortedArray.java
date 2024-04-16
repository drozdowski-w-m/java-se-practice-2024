package pl.globallogic.exercises.ex41;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class SortedArray {

    public static int[] getIntegers(int size){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];

        System.out.println("Enter " + size + " integers: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element "+i+" contents "+array[i]);
        }
    }

    public static int[] sortArray(int[] array){
        Integer[] tempArray = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }
        Arrays.sort(tempArray, Collections.reverseOrder());

        for (int i = 0; i < array.length; i++) {
            array[i] = tempArray[i];
        }
        return array;
    }
}
