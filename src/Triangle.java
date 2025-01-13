public class Triangle implements Figures {
    private String color_Border;
    private String color_Background;
    private int side_AB, side_BC, side_CD;

    public Triangle(int side_AB, int side_BC, int side_CD) {
        this.side_AB = side_AB;
        this.side_BC = side_BC;
        this.side_CD = side_CD;
    }

    public double Area() {
        double area;
        area = this.Perimetr() / 2 * (this.Perimetr() / 2 - side_AB) * (this.Perimetr() / 2 - side_BC) * (this.Perimetr() / 2 - side_CD);
        return Math.sqrt(area);
    }

    public double Perimetr() {
        return side_AB + side_BC + side_CD;
    }

    public void color_Background(String color) {
        this.color_Background = color;
    }

    public void color_Border(String color) {
        this.color_Border = color;
    }

}
