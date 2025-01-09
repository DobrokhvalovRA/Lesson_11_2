import javax.swing.*;
import java.awt.*;

public class Circle implements Figures {
    private String color_Border;
    private String color_Background;
    private int radius;
    private static double pi = 3.14;

    public Circle(int radius) {
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

    public void show(Color bkgColor, Color bColor) {

        JFrame frame = new JFrame("Рисуем круг.");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(bkgColor);
                g.fillOval(100, 50, radius, radius);
                g.setColor(bColor);
                g.drawOval(100, 50, radius, radius);

            }

        };
        Label label = new Label("Круг: " + " Радиус - " + radius + " Площадь - " + this.Area() + " Периметр - " + this.Perimetr());
        panel.add(label);
        frame.add(panel);
        frame.setVisible(true);

        // Почему не работает так ? Если в панель круг исчезает, если без канваса то его вообще не видно

        //Canvas canvas = new Canvas(); // экземпляр холста создан
        //canvas.setBackground(Color.BLACK); // серый холст
        //canvas.setSize(400, 400); // вписан в окно
        //panel.add(canvas);

        //Graphics g = canvas.getGraphics();
        //g.setColor(Color.red);
        //g.fillOval(100, 100, 200, 200);


    }

}
