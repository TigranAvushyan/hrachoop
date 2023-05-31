package task3;


public class SeniorStudent extends Student {
    SeniorStudent(String name, int lessonCount) {
        super(name, lessonCount);
    }

    @Override
    public boolean passExam() {
        return getLessonCount() > 0;
    }
}
