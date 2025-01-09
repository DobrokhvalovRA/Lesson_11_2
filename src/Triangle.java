import javax.swing.*;
import java.awt.*;

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

    public void show(Color bkgColor, Color bColor) {

        JFrame frame = new JFrame("Рисуем триугольник.");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                //частный случай :-)
                int[] xPoints = {100, 100+side_AB, 100+side_AB};
                int[] yPoints = {50, 50, 50+side_BC};
                g.setColor(bkgColor);
                g.fillPolygon(xPoints, yPoints, 3);
                g.setColor(bColor);
                g.drawPolygon(xPoints, yPoints, 3);

            }
        };

        Label label = new Label("Триугольник: " + " Площадь - " + this.Area() + " Периметр - " + this.Perimetr());
        panel.add(label);
        frame.add(panel);
        frame.setVisible(true);

    }
}
