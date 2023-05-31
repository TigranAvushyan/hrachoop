package task1;

public class RealistPerson extends Person {
    RealistPerson(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello(Person person) {
        if (person.getAge() <= 5 || (person.getAge() - this.age <= 5))
            return "Привет, " + person.getName() + "!";
        return "Здравствуй, " + person.getName();
    }

    @Override
    public String tellMyself() {
        return "Меня зовут " + this.name + ", мой возраст" + this.age + ", я реалист";
    }
}
