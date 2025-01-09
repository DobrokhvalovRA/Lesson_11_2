import javax.swing.*;
import java.awt.*;

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

    public void show(Color bkgColor, Color bColor) {

        JFrame frame = new JFrame("Рисуем квадрат.");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(bkgColor);
                g.fillRect(100, 50, width, height);
                g.setColor(bColor);
                g.drawRect(100, 50, width, height);

            }
        };

        Label label = new Label("Квадрат: " + " Площадь - " + this.Area() + " Периметр - " + this.Perimetr());
        panel.add(label);
        frame.add(panel);
        frame.setVisible(true);

    }
}
