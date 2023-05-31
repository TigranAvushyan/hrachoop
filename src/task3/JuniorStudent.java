package task3;

import static task2.Random.getRandomBooleanWithChance;

public class JuniorStudent extends Student {
    JuniorStudent(String name, int lessonCount) {
        super(name, lessonCount);
    }

    @Override
    public boolean passExam() {
        if (getLessonCount() == Exam.ALL_LESSON) return true;
        if (getLessonCount() > Exam.ALL_LESSON / 2) return getRandomBooleanWithChance(0.5f);
        return false;
    }
}
