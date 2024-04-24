package pl.globallogic.sessions.session1;

import pl.globallogic.sessions.session2.DoubleValueSupplier;

import java.util.ArrayList;
import java.util.List;

public class GenericsPlayground {
    public static void main(String[] args) {
        List nonGenericList = new ArrayList();
        nonGenericList.add(1);
        nonGenericList.add("apple");
        nonGenericList.add(new int[]{3,5});
/*
        for (Object item : nonGenericList){
            System.out.println(item);
        }
*/
  //      printUpperCaseWords();
        Box<String> stringBox = new Box<>();
        stringBox.set("Banana");
        System.out.println(stringBox.get());
        Box<List<String>> listBox = new Box<>();
        listBox.set(List.of("some","string"));
        System.out.println(listBox.get());


        short val = 20;
        DoubleValueSupplier<Integer> fromIntSupplier = new DoubleValueSupplier<>();
        DoubleValueSupplier<Float> fromFloatSupplier = new DoubleValueSupplier<>();
        DoubleValueSupplier<Short> fromShortSupplier = new DoubleValueSupplier<>();
        DoubleValueSupplier<Number> fromString = new DoubleValueSupplier<>();

        fromIntSupplier.set(10);
        fromFloatSupplier.set(13.53f);
        fromShortSupplier.set(val);

        System.out.println("INT: "+ fromIntSupplier.getDoubleValue() + " SHORT: "+ fromShortSupplier.getDoubleValue());
    }
}
/*
public static void printUpperCaseWords(List words){
    for (Object word : words){
        if ( word instanceof String)
            System.out.println(word);
    }
}
*/