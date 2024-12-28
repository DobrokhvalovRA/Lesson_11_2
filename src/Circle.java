public class Circle implements Figures {
    private String color_Border;
    private String color_Background;
    private double radius;
    private static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double Area() {
        return 2 * pi * this.radius * this.radius;
    }

    public double Perimetr() {
        return 2 * pi * this.radius;
    }

    public void color_Background(String color) {
        this.color_Background = color;
    }

    public void color_Border(String color) {
        this.color_Border = color;
    }


}
