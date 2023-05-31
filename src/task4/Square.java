package task4;

public class Square extends Piece {
    private final double width;

    public Square(double thick, double density, double width) {
        super(thick, density);
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * width;
    }

    @Override
    public String toString() {
        return "Квадрат:"
                + "\nсторана: " + this.width
                + "\nтолщина: " + this.thick
                + "\nплотность: " + this.density
                + "\nплощадь: " + this.getArea()
                + "\nвес: " + this.getWeight();
    }

}
