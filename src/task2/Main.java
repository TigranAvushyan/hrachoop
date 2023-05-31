package task2;

public class Main {
    public static void main(String[] args) {
        Archer[] archers = new Archer[]{
                new JuniorArcher("JuniorArcher 1", 21, 1),
                new MiddleArcher("MiddleArcher 1", 27, 7),
                new SeniorArcher("SeniorArcher 1", 49, 19),
                new MiddleArcher("MiddleArcher 2", 32, 12),
                new JuniorArcher("JuniorArcher 2", 24, 4),
                new SeniorArcher("SeniorArcher 2", 60, 40),
        };

        for (Archer archer: archers) {
            boolean result = archer.shoot();
            if (result) {
                System.out.printf("%s - попал\n", archer.getInfo());
                break;
            }
            System.out.printf("%s - не попал\n", archer.getInfo());
        }

    }
}
