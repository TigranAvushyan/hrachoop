package task1;

public class InformalPerson extends Person {
    InformalPerson(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello(Person person) {
        return "Привет, " + person.getName() + "!";
    }

    @Override
    public String tellMyself() {
        return "Меня зовут " + this.name + ", мой возраст" + this.age + ", я неформалист";
    }
}