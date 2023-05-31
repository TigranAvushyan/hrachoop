package task4;

public class Rectangle extends Piece {
    private final double width;
    private final double length;

    public Rectangle(double thick, double density, double width, double length) {
        super(thick, density);
        this.width = width;
        this.length = length;
    }


    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public String toString() {
        return "Прямоугольник"
                + "\nширина: " + this.width
                + "\nдлина: " + this.length
                + "\nтолщина: " + this.thick
                + "\nплотность: " + this.density
                + "\nплощадь: " + this.getArea()
                + "\nвес: " + this.getWeight();
    }
}
