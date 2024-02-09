public abstract class Parallelogram {
    protected double side;
    protected double height;

    public Parallelogram(double side, double height) {
        this.side = side;
        this.height = height;
    }


    public abstract double area();
}


