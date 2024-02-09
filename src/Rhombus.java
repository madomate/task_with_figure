public class Rhombus implements Shape{
    protected double diagonal1;
    protected double diagonal2;

    public Rhombus(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double area() {
        return diagonal1 * diagonal2;
    }
}
