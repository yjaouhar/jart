package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Triangle implements Drawable {
    private Point p1, p2, p3;
    private Color color;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        Random rand = new Random();
        this.color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }

    @Override
    public void draw(Displayable displayable) {
        Line line1 = new Line(p1, p2, color);
        Line line2 = new Line(p1, p3, color);
        Line line3 = new Line(p2, p3, color);

        line1.draw(displayable);
        line2.draw(displayable);
        line3.draw(displayable);
    }

    @Override
    public Color getColor() {
        return color;
    }

}
