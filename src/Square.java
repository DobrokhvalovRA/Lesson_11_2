public class Square implements Figures {
    private String color_Border;
    private String color_Background;
    private double length, width;
        public Square(double length, double width){
        this.length = length;
            this.width = width;
    }
    public double Area() {
        return length*width;
    }

    public double Perimetr() {
        return 2*length+2*width;
    }
    public void color_Background(String color){
        this.color_Background = color;
    }
    public void color_Border(String color){
        this.color_Border = color;
    }
}
