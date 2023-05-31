package task3;

import static task3.Random.getRandomBooleanWithChance;

public class MiddleStudent extends Student {
    MiddleStudent(String name, int lessonCount) {
        super(name, lessonCount);
    }

    @Override
    public boolean passExam() {
        if (getLessonCount() == Exam.ALL_LESSON) return true;
        if (getLessonCount() > Exam.ALL_LESSON / 2) return getRandomBooleanWithChance(0.7f);
        return false;
    }
}
