import java.awt.*;

import geometrical_shapes.Line;

import geometrical_shapes.Point;
// import geometrical_shapes.Rectangle;
import geometrical_shapes.Triangle;

interface Displayable {
    void display(int x, int y, Color color);

    void save(String string);
}

interface Drawable {
    void draw(Displayable displayable);

    Color getColor();
}

public class Main {
    public static void main(String[] args) {
        int width = 1000, height = 1000;
        Image image = new Image(width, height);
        // Line line = new Line(Point.random(width, height), Point.random(width, height));
        // line.draw(image);
        Triangle triangle = new Triangle(new Point(100, 100), new Point(500, 500), new Point(100, 500));
        triangle.draw(image);

        // for (int i = 0; i < 50; i++) {
        // Circle circle = Circle.random(image.getWidth(), image.getHeight());
        // circle.draw(image);
        // }
        image.save("image.png");
    }
}