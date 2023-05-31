package task4;

public class Triangular extends Piece {
    private final double leg1;
    private final double leg2;

    public Triangular(double thick, double density, double leg1, double leg2) {
        super(thick, density);
        this.leg1 = leg1;
        this.leg2 = leg2;
    }


    @Override
    public double getArea() {
        return this.leg1 * this.leg2 / 2;
    }

    @Override
    public String toString() {
        return "Треугольник:"
                + "\nкатет 1: " + this.leg1
                + "\nкатет 2: " + this.leg2
                + "\nтолщина: " + this.thick
                + "\nплотность: " + this.density
                + "\nплощадь: " + this.getArea()
                + "\nвес: " + this.getWeight();
    }
}
