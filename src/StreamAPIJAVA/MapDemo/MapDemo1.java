package StreamAPIJAVA.MapDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class MapDemo1 {
    public static void main(String[] args) {
        String[] vehicles = {"Car", "Bike", "Bus", "Truck", "Van"};
        List<String> vehicleList = List.of(vehicles);
        List<String> vehicleListUpperCase = new ArrayList<String>();
        // Convert all vehicle names to uppercase without stream API
        for (String vehicle : vehicleList) {
            vehicleListUpperCase.add(vehicle.toUpperCase());
        }
        System.out.println("Vehicle names in uppercase without Stream API: " + vehicleListUpperCase);

        // Convert all vehicle names to uppercase with stream API
        List<String> vehicleListUpperCaseWithStream = vehicleList.stream()
                .map(String::toUpperCase) // Convert each vehicle name to uppercase
                .toList(); // Collect the results into a list
        System.out.println("Vehicle names in uppercase with Stream API: " + vehicleListUpperCaseWithStream);

//        Create a list of vehicle lengths
        List<Integer> vehicleLengths = vehicleList.stream()
                .map(String::length) // Map each vehicle name to its length
                .toList(); // Collect the results into a list
        System.out.println("Vehicle name lengths: " + vehicleLengths);

        // Create a list of vehicle names with their lengths
        List<String> vehicleWithLengths = vehicleList.stream()
                .map(vehicle -> vehicle + " (" + vehicle.length() + ")") // Append length to each vehicle name
                .toList(); // Collect the results into a list
        System.out.println("Vehicle names with lengths: " + vehicleWithLengths);
        // Create a list of vehicle names with their lengths using lambda expression
        List<String> vehicleWithLengthsLambda = vehicleList.stream()
                .map(vehicle -> {
                    int length = vehicle.length();
                    return vehicle + " (" + length + ")";
                }) // Append length to each vehicle name using lambda expression
                .toList(); // Collect the results into a list
        System.out.println("Vehicle names with lengths using lambda: " + vehicleWithLengthsLambda);

    }
}
