package StreamAPIJAVA.ParallelStream;

import java.util.Arrays;
import java.util.List;

class Student {
    int id;
    String name;
    double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public int getId() {
        return id;
    }
}
public class ParallelStreamDemo1 {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student(1, "Alice", 85.5),
                new Student(2, "Bob", 92.0),
                new Student(3, "Charlie", 78.5),
                new Student(4, "David", 88.0),
                new Student(5, "Eve", 55.0)
        );
//        with using stream API
        System.out.println("Using stream API:");
        studentList.stream()
                .filter(student -> student.getMarks() < 80)
                .forEach(stu -> System.out.println(stu.getName() + "--> " + stu.getMarks() + " , "));

        //    with using parallel stream API
        System.out.println("Using Parallel stream API:");
        studentList.parallelStream()
                .filter(student -> student.getMarks() > 80)
                .forEach(stu -> System.out.println(stu.getName() + "--> " + stu.getMarks() + " , "));

//        we can convert Stream() -- to ParallelStream() and vice versa
        System.out.println("Convert stream to Parallel stream API:");
        studentList.stream().parallel()
                .filter(student -> student.getMarks() == 88)
                .forEach(stu -> System.out.println(stu.getName() + "--> " + stu.getMarks() + " , "));
    }
}
