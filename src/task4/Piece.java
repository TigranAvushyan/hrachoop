package task4;

public abstract class Piece implements Element {
    protected double thick;
    protected double density;

    Piece(double thick, double density) {
        this.thick = thick;
        this.density = density;
    }

    @Override
    public double getWeight() {
        return this.getArea() * this.density * this.thick;
    }
}
