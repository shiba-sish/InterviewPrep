package StreamAPIJAVA.StreamMethods;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


// Non-terminal operations in Stream API
// Non-terminal operations are operations that return a new stream or a collection, allowing further processing of the data.
// These operations do not modify the original stream but create a new one based on the specified criteria.
// Examples of non-terminal operations include `count()`, `distinct()`, `sorted()`,`limit()`, and `skip()`.

// Terminal operations in Stream API
// Terminal operations are operations that produce a result or a side effect and terminate the stream processing.
// These operations do not return a stream but instead return a final result, such as a collection, a single value, or a boolean.
// Examples of terminal operations include `forEach()`, `collect()`, `reduce()`, `anyMatch()`, `allMatch()`, and `noneMatch()`.

public class StreamMethodDemo1 {
    public static void main(String[] args) {
        List<String> vehicaleList = List.of(
                "Car",
                "Bike",
                "Bus",
                "Car",
                "Truck",
                "Bus",
                "Van"
        );
        // Count the number of vehicles
        long count = vehicaleList.stream().count();
        System.out.println("Total number of vehicles: " + count);

//        distinct() method
        List<String> distinctCount = vehicaleList.stream().distinct().toList();
        System.out.println("Total of distinct vehicles: " + distinctCount);
        vehicaleList.stream().distinct().toList().forEach(System.out::println);

//        sorted() method
        List<String> sortedList = vehicaleList.stream().sorted().toList();
        System.out.println("Sorted list of vehicles: " + sortedList);
//        sorted() method with reverse order
        List<String> sortedListReverse = vehicaleList.stream().sorted((a, b) -> b.compareTo(a)).toList();
        System.out.println("Sorted list of vehicles in reverse order: " + sortedListReverse);

//        sorted() method with length
        List<String> sortedListByLength = vehicaleList.stream()
                .sorted((a, b) -> Integer.compare(a.length(), b.length()))
                .toList();
        System.out.println("Sorted list of vehicles by length: " + sortedListByLength);

//        sorted() method with length in reverse order
        List<String> sortedListByLengthReverse = vehicaleList.stream()
                .sorted((a, b) -> Integer.compare(b.length(), a.length()))
                .toList();
        System.out.println("Sorted list of vehicles by length in reverse order: " + sortedListByLengthReverse);

//        limit() method
        List<String> limitedList = vehicaleList.stream().limit(3).toList();
        System.out.println("Limited list of vehicles (first 3): " + limitedList);

//        skip() method
        List<String> skippedList = vehicaleList.stream().skip(3).toList();
        System.out.println("Skipped list of vehicles (first 3 skipped): " + skippedList);

//collect() method
//        collect(Collectors.toList()) return a List which we can modify later
//        toList() also return a list, but we cannot modify it later
        List<String> collectedList = vehicaleList.stream().collect(Collectors.toList());
        System.out.println("Collected list of vehicles: " + collectedList);

//        reduce() method
        Optional<String> reducedString = vehicaleList.stream()
                .reduce((a, b) -> a + b); // Concatenate all vehicle names
        System.out.println("Reduced string of vehicles: " + reducedString.get());

//        anyMatch() method
        boolean anyMatch = vehicaleList.stream()
                .anyMatch(vehicle -> vehicle.equalsIgnoreCase("Car")); // Check if any vehicle is "Car"
        System.out.println("Any vehicle is a Car: " + anyMatch);

//        allMatch() method
        boolean allMatch = vehicaleList.stream()
                .allMatch(vehicle -> vehicle.length() > 2); // Check if all vehicles have length greater than 2
        System.out.println("All vehicles have length greater than 2: " + allMatch);

//        noneMatch() method
        boolean noneMatch = vehicaleList.stream()
                .noneMatch(vehicle -> vehicle.equalsIgnoreCase("Plane")); // Check if no vehicle is "Plane"
        System.out.println("No vehicle is a Plane: " + noneMatch);

//        min() and max() methods
        String minVehicle = vehicaleList.stream()
                .min(String::compareToIgnoreCase) // Find the minimum vehicle name
                .orElse("No vehicles available");
        System.out.println("Minimum vehicle name: " + minVehicle);

        String maxVehicle = vehicaleList.stream()
                .max(String::compareToIgnoreCase) // Find the maximum vehicle name
                .orElse("No vehicles available");
        System.out.println("Maximum vehicle name: " + maxVehicle);

//        toArray() method
        Object[] vehicleArray = vehicaleList.stream()
                .toArray(); // Convert the stream to an array
        System.out.println("Vehicle names in array: " + vehicleArray.length);



    }
}
