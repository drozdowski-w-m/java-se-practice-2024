package pl.globallogic.sessions.challenges;

import java.util.Arrays;
import java.util.List;

public class MyArrays {

    public static void main(String[] args) {

        // toString(array) - returns a string in [ ], each element separated by commas ,
        // useful for debugging and printing array contents
        int[] arrayToPrint = {1, 2, 3, 4, 5};
        String arrayString = Arrays.toString(arrayToPrint);
        System.out.println("Array.toString() looks like this: "+arrayString);


        // equals(array, array) - checks if two arrays are equal. Returns true if:
        //      arrays have same length
        //      corresponding elements at the same index position hold identical values
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean isEqual = Arrays.equals(array1,array2);
        System.out.println("Arrays.equals(): "+isEqual);


        // fill(array, value) - assigns a specifed value to all elements of an array
        // its convenient way of filling whole array
        int[] filledArray = new int[6];
        Arrays.fill(filledArray,6);
        System.out.println("Filled array: "+ Arrays.toString(filledArray));


        // copyOf(array, newLength) - creates copy of array with given length
        //      if length > original, array is padded with default values for the element type
        //      if length < original, only first elements are copied
        int[] orginalArray = {1, 2, 3, 4, 5};
        int[] copiedArray = Arrays.copyOf(orginalArray, orginalArray.length);
        int[] copiedArrayLonger = Arrays.copyOf(orginalArray, orginalArray.length + 3);
        System.out.println("copyOf() copiedArray: "+Arrays.toString(copiedArray));
        System.out.println("copyOf() copiedArrayLonger: "+Arrays.toString(copiedArrayLonger));


        // copyOfRange(array, from, to) - creates a copy of portion of an array
        //      from - starting inclusive index, to - ending exclusive index
        int[] partialArray = Arrays.copyOfRange(orginalArray, 1, 3);
        System.out.println("copyOfRange() : "+Arrays.toString(partialArray) );


        // sort(array) - sorts primitives as well as objects.
        //      to sort self made object you need to define a natural ordering by implementing
        //      the 'Comparable' interface and its compareTo() method
        //      NOTICE: it overwrites the pointed array
        int[] arrayToSort = {5, 2, 9, 1, 7};
        Arrays.sort(arrayToSort);
        System.out.println("Sorted array: "+ Arrays.toString(arrayToSort));


        // binarySearch(array, key) - more effective than linear search
        //      returns the index of the element in the sorted array that matches they 'key'
        //      should always be used on sorted arrays or it may be unpredictable
        int index = Arrays.binarySearch(arrayToSort, 9);
        System.out.println("binary search index: "+ index);


        // asList(array) - transforms an array into a List object
        //      works only as a 'wrapper', fixed length, cannot add or remove elements
        String[] names = {"Alice", "Bob", "Trish"};
        List<String> namesList = Arrays.asList(names);

        // print elements
        for(String name : namesList)
            System.out.println(name);

        //attempt to add an element - throws UnsupportedOperationException
        //namesList.add("Dave");

    }
}
