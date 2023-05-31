package task3;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new JuniorStudent("JuniorStudent1", 5),
                new JuniorStudent("JuniorStudent2", 17),
                new JuniorStudent("JuniorStudent3", 10),
                new JuniorStudent("JuniorStudent4", 11),
                new JuniorStudent("JuniorStudent5", 20),
                new MiddleStudent("MiddleStudent1", 0),
                new MiddleStudent("MiddleStudent2", 1),
                new MiddleStudent("MiddleStudent3", 11),
                new MiddleStudent("MiddleStudent4", 20),
                new SeniorStudent("SeniorStudent1", 1)
        };

        for (Student student : students) {
            System.out.printf("%s: %b\n", student.getName(), student.passExam());
        }
    }
}
