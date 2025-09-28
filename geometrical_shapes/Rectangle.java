package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Rectangle implements Drawable {
    private Point p1, p2;
    private Color color;

    public Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        Random rand = new Random();
        this.color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }

    @Override
    public void draw(Displayable displayable) {
        Point p3 = new Point(p2.getX(), p1.getY());
        Point p4 = new Point(p1.getX(), p2.getY());
        Line line1 = new Line(p1, p3, color);
        Line line2 = new Line(p1, p4, color);
        Line line3 = new Line(p2, p3, color);
        Line line4 = new Line(p2, p4, color);

        line1.draw(displayable);
        line2.draw(displayable);
        line3.draw(displayable);
        line4.draw(displayable);
    }

    @Override
    public Color getColor() {
        return color;
    }

}
