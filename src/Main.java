public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        circle.color_Border("Red");
        circle.color_Background("Blue");
        Square square = new Square(2, 2);
        Triangle triangle = new Triangle(2, 2, 2);

        System.out.println("Периметр квадрата = " + square.Perimetr());
        System.out.println("Площадь квадрата = " + square.Area());
        System.out.println("Периметр круга = " + circle.Perimetr());
        System.out.println("Площадь круга = " + circle.Area());
        System.out.println("Периметр треугольника = " + triangle.Perimetr());
        System.out.println("Площадь треугольника = " + triangle.Area());

    }
}
