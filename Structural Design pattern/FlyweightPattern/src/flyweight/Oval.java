package flyweight;

import java.awt.Color;
import java.awt.Graphics;

public class Oval implements Shape {
    // intrinsic property
    private boolean isFilled;

    public Oval(boolean isFilled) {
        this.isFilled = isFilled;
        System.out.println("Creating Oval object with fill: " + isFilled);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics graphics, int x, int y, int width, int height,
            Color color) {
        graphics.setColor(color);
        graphics.drawOval(x, y, width, height);
        if (isFilled) {
            graphics.fillOval(x, y, width, height);
        }
    }

}
