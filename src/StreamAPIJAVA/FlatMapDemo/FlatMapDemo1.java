package StreamAPIJAVA.FlatMapDemo;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo1 {
    public static void main(String[] args) {
//        map()
        List<Integer> list1=Arrays.asList(1,2,3,4,5);
        List<Integer> list2=list1.stream()
                .map(n -> n * 2) // Multiply each element by 2
                .toList();
        System.out.println("List after map operation: " + list2);
//        flatMap()
        List<Integer> l1 = Arrays.asList(1,2);
        List<Integer> l2 = Arrays.asList(3,4);
        List<Integer> l3 = Arrays.asList(5,6);
        List<List<Integer>> finalList = Arrays.asList(l1, l2, l3);
        List<Integer> finalResult = finalList.stream()
                .flatMap(x -> x.stream()
                .map(n-> n*10)).toList();
        System.out.println("List after flatMap operation: " + finalResult);
    }
}
