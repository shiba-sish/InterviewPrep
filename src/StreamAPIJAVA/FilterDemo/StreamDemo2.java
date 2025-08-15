package StreamAPIJAVA.FilterDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class StreamDemo2 {
    public static void main(String[] args) {
        filterLongNames();
        filterNull();
    }
//    filter long names
public static void filterLongNames() {
    List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
    names.stream().filter(name -> name.length()>2 && name.length()<5).toList()
            .forEach(System.out::println);
}
// Filter null and store it on a different list
public static void filterNull() {
    List<String> names = Arrays.asList("Alice", null, "Bob", "Charlie", null, "David", "Eve");
    List <String> newNames=names.stream().filter(Objects::nonNull).filter(name -> name.length()>2 && name.length()<5).toList();
    System.out.println("Names without null: " + newNames);
}
}
