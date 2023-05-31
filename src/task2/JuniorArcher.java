package task2;

import static task2.Random.getRandomBooleanWithChance;

public class JuniorArcher extends Archer {
    JuniorArcher(String name, int age, int experience) {
        super(name, age, experience);
    }

    @Override
    public boolean shoot() {
        return getRandomBooleanWithChance((this.experience * 0.01f));
    }
}
