package task2;

import static task2.Random.getRandomBooleanWithChance;

public class SeniorArcher extends Archer {
    SeniorArcher(String name, int age, int experience) {
        super(name, age, experience);
    }

    @Override
    public boolean shoot() {
        return getRandomBooleanWithChance(0.9f - (this.experience * 0.01f));
    }
}