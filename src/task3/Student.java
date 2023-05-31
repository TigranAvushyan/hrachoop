package task3;

public abstract class Student implements Exam {
    private final String name;
    private final int lessonCount;


    Student(String name, int lessonCount) {
        this.name = name;
        this.lessonCount = lessonCount;
    }

    public String getName() {
        return name;
    }

    public int getLessonCount() {
        return lessonCount;
    }
}
