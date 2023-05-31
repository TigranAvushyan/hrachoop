package task2;

import static task2.Random.getRandomBooleanWithChance;

public class MiddleArcher extends Archer {
    MiddleArcher(String name, int age, int experience) {
        super(name, age, experience);
    }

    @Override
    public boolean shoot() {
        return getRandomBooleanWithChance((this.experience * 0.05f));
    }
}