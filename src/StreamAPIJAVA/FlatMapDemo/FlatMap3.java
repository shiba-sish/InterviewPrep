package StreamAPIJAVA.FlatMapDemo;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class Student {
    String name;
    int age;
    String city;

    public Student(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
}
public class FlatMap3 {
    public static void main(String[] args) {
        List<Student> studentList1 = List.of(
                new Student("Alice", 20, "New York"),
                new Student("Bob", 22, "Los Angeles"),
                new Student("Charlie", 21, "Chicago"),
                new Student("David", 23, "Houston")
        );
        List<Student> studentList2 = List.of(
                new Student("Eve", 24, "Phoenix"),
                new Student("Frank", 25, "Philadelphia"),
                new Student("Grace", 26, "San Antonio"),
                new Student("Hannah", 27, "San Diego")
        );
        List<Student> studentList3 = Arrays.asList(
                new Student("Ian", 28, "Dallas"),
                new Student("Jack", 29, "San Jose"),
                new Student("Kathy", 30, "Austin"),
                new Student("Liam", 31, "Jacksonville")
        );
        List<List<Student>> studentGroups = List.of(studentList1, studentList2, studentList3);
        studentGroups.parallelStream().flatMap(Collection::stream).filter(age -> age.age > 25).map(student -> student.name)
                .forEach(student -> System.out.println("Student Name age above 25 ->"+student));
    }
}
