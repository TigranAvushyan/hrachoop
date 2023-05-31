package task4;

public class Main {
    public static void main(String[] args) {
        PieceFactory factory = new PieceFactory();
        Piece[] pieces = new Piece[15];
        for (int i = 0; i < pieces.length; i++) {
            if (i < 5) {
                pieces[i] = factory.createPieces(PieceType.SQUARE);
            }
            if (i >=5 && i < 12) {
                pieces[i] = factory.createPieces(PieceType.RECTANGLE);
            }
            else  {
                pieces[i] = factory.createPieces(PieceType.TRIANGLE);
            }
        }



        for (Piece piece : pieces) {
            System.out.println(piece);
            System.out.println();
        }

    }
}
