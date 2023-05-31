package task2;

public abstract class Archer {
    protected String name;
    protected int age;
    protected int experience;

    Archer(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public String getInfo() {
        return "Имя: " + this.name + ", Возраст: " + this.age + ", Опыт: " + this.experience;
    }
    public abstract boolean shoot();

    public int getAge() {
        return this.age;
    }

    public int getExperience() {
        return this.experience;
    }

    public String getName() {
        return this.name;
    }
}
