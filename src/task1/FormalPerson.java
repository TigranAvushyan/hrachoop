package task1;

public class FormalPerson extends Person {
    FormalPerson(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello(Person person) {
        return "Здравствуй, " + person.getName();
    }

    @Override
    public String tellMyself() {
        return "Меня зовут " + this.name + ", мой возраст" + this.age + ", я формалист";
    }
}
