package pl.globallogic.exercises.ex43;

import java.util.Arrays;

public class ReverseArray {
    public static void reverse(int[] array){

        System.out.println("Input array: "+Arrays.toString(array));

        int lastElementIndex = array.length-1;
        int firstElementIndex = 0;
        int temp = 0;

        while (lastElementIndex > firstElementIndex){
            temp = array[firstElementIndex];
            array[firstElementIndex] = array[lastElementIndex];
            array[lastElementIndex] = temp;

            firstElementIndex++;
            lastElementIndex--;
        }

        System.out.println("Reversed array: "+Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        reverse(array);


    }
}
