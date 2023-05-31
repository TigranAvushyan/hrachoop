package task1;

public class Main {

    private static int getRandom(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {
        Person[] group = PersonGroupFactory.createPersonGroup();
        PersonChat.startChat(group);
    }
}