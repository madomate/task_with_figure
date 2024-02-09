public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника 4см*6см = " + rectangle.area());

        Square square = new Square(3);
        System.out.println("Площадь квадрата 3см*3см = " + square.area());

        Rhombus rhombus = new Rhombus(4, 3);
        System.out.println("Площадь ромба со стороной 4см и высотой 3см = " + rhombus.area());//12 должно быт

        Circle circle = new Circle(2);
        System.out.println("Площадь круга с радиусом 2см = " + circle.area());
    }

}
