package task1;

public class PersonGroupFactory {
    private static int getRandom(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static Person[] createPersonGroup() {

        String[] names = new String[]{"Александр", "Андрей", "Анастасия", "Ирина", "Наталья", "Павел", "Роман", "Светлана", "Сергей", "Татьяна"};
        Person[] persons = new Person[5];

        for (int i = 0; i < persons.length; i++) {
            String name = names[getRandom(0, persons.length - 1)];
            int age = getRandom(20, 40);
            int randomType = getRandom(1, 3);

            if (randomType == 1) {
                persons[i] = new FormalPerson(name, age);
            }
            if (randomType == 2) {
                persons[i] = new InformalPerson(name, age);
            }
            if (randomType == 3) {
                persons[i] = new RealistPerson(name, age);
            }

        }
        return persons;
    }
}
