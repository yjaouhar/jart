package geometrical_shapes;

import java.util.Random;
import java.awt.*;

public class Point implements Drawable {
    private int x, y;
  private Color color = Color.WHITE;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public static Point random(int width, int height) {
        Random rand = new Random();
        return new Point(rand.nextInt(width), rand.nextInt(height));
    }

    @Override
    public void draw(Displayable displayable) {
          displayable.display(x, y, color);
    }

    @Override
    public Color getColor() {
        return color;
    }

}
