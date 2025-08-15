package StreamAPIJAVA.FlatMapDemo;

import java.util.List;

public class FlatMap2 {
    public static void main(String[] args) {
        List<String> teamA = List.of("Alice", "Bob", "Charlie");
        List<String> teamB = List.of("David", "Eve", "Frank");
        List<String> teamC = List.of("Grace", "Hannah", "Ian");
        List<List<String>> WCteams = List.of(teamA, teamB, teamC);
//        without using stream API
        System.out.println("Without using stream API:");
        for (List<String> team : WCteams) {
            for (String player : team) {
                System.out.print(player + " ,");
            }
        }
        System.out.println();

//        Using flatMap
        System.out.println("Using flatMap:");
        WCteams.stream()
                .flatMap(team -> team.stream())
                .forEach(player -> System.out.print(player + " ,"));

    }
}
