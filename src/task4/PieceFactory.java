package task4;

public class PieceFactory {
    private double getRandomNumber() {
        return  ((Math.random() * (100 - 1)) + 1);
    }
    public Piece createPieces(PieceType type) {

        return switch (type) {
            case SQUARE -> new Square(
                    getRandomNumber(),
                    getRandomNumber(),
                    getRandomNumber()
            );
            case TRIANGLE -> new Triangular(
                    getRandomNumber(),
                    getRandomNumber(),
                    getRandomNumber(),
                    getRandomNumber()
            );
            case RECTANGLE -> new Rectangle(
                    getRandomNumber(),
                    getRandomNumber(),
                    getRandomNumber(),
                    getRandomNumber()
            );
        };
    }
}
