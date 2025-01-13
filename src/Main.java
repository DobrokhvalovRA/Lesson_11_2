public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(200);

        Square square = new Square(200, 200);

        Triangle triangle = new Triangle(200, 200, 200);

        System.out.println("Периметр квадрата = " + square.Perimetr());
        System.out.println("Площадь квадрата = " + square.Area());
        System.out.println("Периметр круга = " + circle.Perimetr());
        System.out.println("Площадь круга = " + circle.Area());
        System.out.println("Периметр треугольника = " + triangle.Perimetr());
        System.out.println("Площадь треугольника = " + triangle.Area());


    }
}
