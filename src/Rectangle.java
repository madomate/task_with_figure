public class Rectangle implements Shape {
    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {//вычисление площади
        return a * b;
    }
}
