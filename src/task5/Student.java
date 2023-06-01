package task5;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Student {
    private String firstName;
    private String lastName;
    private int[] points;

    Student(String firstName, String lastName, int[] points) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.points = points;
    }


    public String getLastName() {
        return lastName;
    }

    public int[] getPoints() {
        return points;
    }

    public String getFirstName() {
        return firstName;
    }


    @Override
    public String toString() {
        return "FirstName: " + firstName + "\nLastName: " + lastName + "\nPoints: " + Arrays.stream(points)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}
