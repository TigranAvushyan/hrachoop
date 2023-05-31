package task1;

public class PersonChat {
    public static void startChat(Person[] persons) {
        for (int i = 0; i < persons.length; i++) {
            Person firstPerson = persons[i];
            for (int j = i + 1; j < persons.length; j++) {
                Person secondPerson = persons[j];
                System.out.printf("%s: %s \n", firstPerson.getName(), firstPerson.sayHello(secondPerson));
                System.out.printf("%s: %s \n", secondPerson.getName(), secondPerson.sayHello(firstPerson));
            }
        }
    }
}
