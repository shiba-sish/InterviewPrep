package StreamAPIJAVA.FilterDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemos1 {
    public static void main(String[] args) {
//        ArrayList<Integer> numberList = new ArrayList<Integer>();
//        numberList.add(1);
//        numberList.add(2);
//        numberList.add(3);
//        numberList.add(4);
//        numberList.add(5);
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumberList = new ArrayList<>();
//        Without Stream API
        for (Integer number : numberList) {
            if (number % 2 == 0) {
                evenNumberList.add(number);
            }
        }
        System.out.println("Even numbers without Stream API: " + evenNumberList);
        // With Stream API
        List<Integer> evenNumbersWithStream = numberList.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers with Stream API: " + evenNumbersWithStream);
//        Direct print the data
        numberList.stream()
                .filter(number -> number % 2 == 0).forEach(n-> System.out.print(n + " "));//consumer
        numberList.stream()
                .filter(number -> number % 2 == 0).forEach(System.out::println);//method reference
    }

}
