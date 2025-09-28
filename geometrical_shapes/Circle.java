package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Circle implements Drawable {
    private Point center;
    private int radius;
    private Color color;
    private static Random random = new Random();
    
    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
        this.color = Color.GREEN;
    }
    
    public Circle(Point center, int radius, Color color) {
        this.center = center;
        this.radius = radius;
        this.color = color;
    }
    
    public static Circle random(int maxWidth, int maxHeight) {
        Point center = Point.random(maxWidth, maxHeight);
        int radius = random.nextInt(maxWidth / 2) + 2;
        Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        return new Circle(center, radius, randomColor);
    }
    
    @Override
    public void draw(Displayable displayable) {
        int centerX = center.getX();
        int centerY = center.getY();

        int x = 0;
        int y = -radius;
        int d = -radius;
        
        // drawCirclePoints(displayable, centerX, centerY, x, y);
        
        while (x < -y) {
            if (d > 0) {
                y++;
                d += 2 * (x + y) + 1;
            } else {
                d += 2*x + 1;
            }
            drawCirclePoints(displayable, centerX, centerY, x, y);
            x++;
        }
    }
    
    private void drawCirclePoints(Displayable displayable, int centerX, int centerY, int x, int y) {
        displayable.display(centerX + x, centerY + y, color);
        displayable.display(centerX - x, centerY + y, color);
        displayable.display(centerX + x, centerY - y, color);
        displayable.display(centerX - x, centerY - y, color);
        displayable.display(centerX + y, centerY + x, color);
        displayable.display(centerX - y, centerY + x, color);
        displayable.display(centerX + y, centerY - x, color);
        displayable.display(centerX - y, centerY - x, color);
    }
    
    @Override
    public Color getColor() {
        return color;
    }

}