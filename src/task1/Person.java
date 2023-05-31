package task1;

public abstract class Person {
    protected final String name;
    protected final int age;

    Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public abstract String sayHello(Person person);


    public abstract String tellMyself();


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
