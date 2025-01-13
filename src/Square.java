public class Square implements Figures {
    private String color_Border;
    private String color_Background;
    private int height, width;

    public Square(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public double Area() {
        return height * width;
    }

    public double Perimetr() {
        return 2 * height + 2 * width;
    }

    public void color_Background(String color) {
        this.color_Background = color;
    }

    public void color_Border(String color) {
        this.color_Border = color;
    }

}
