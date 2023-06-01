package task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static List<Student> filterStudents(Student[] students) {
        List<Student> studentArr = Arrays.asList(students);
        return studentArr.stream()
                .filter(student ->
                        student.getFirstName().length() == 4 &&
                                Arrays.stream(student.getPoints()).anyMatch(p -> p < 4))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Tign", "Avushyan", new int[]{9, 2, 4, 5}),
                new Student("Hrac", "Mxitaryan", new int[]{9, 3}),
                new Student("Artyom", "Mxitaryan", new int[]{9}),
                new Student("Anna", "Gasparyan", new int[]{9, 4}),
                new Student("Ansuh", "Avushyan", new int[]{9, 5}),
                new Student("Ani", "Kardashyan", new int[]{9, 7}),
                new Student("Gagik", "Poxosyan", new int[]{9, 10})
        };

        for (Student student : students) {
            System.out.println(student + "\n");
        }
    }
}
