import geometrical_shapes.Line;

import geometrical_shapes.*;

public class Main {
    public static void main(String[] args) {
        int width = 1000, height = 1000;
        Image image = new Image(width, height);
        Line line = Line.random(width, height);
        line.draw(image);
        Triangle triangle = new Triangle(new Point(100, 100), new Point(900, 900), new Point(100, 900));
        triangle.draw(image);
        Rectangle rectangle = new Rectangle(new Point(50, 50), new Point(300, 200));
        rectangle.draw(image);

        for (int i = 0; i < 50; i++) {
        Circle circle = Circle.random(image.getWidth(), image.getHeight());
        circle.draw(image);
        }
        image.save("image.png");
    }
}