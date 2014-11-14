package test;

import composite.Circle;
import composite.Drawing;
import composite.Shape;
import composite.Triangle;

public class CompositePatternTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape triangle1 = new Triangle();
        Shape circle = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(triangle);
        drawing.add(triangle1);
        drawing.add(circle);

        drawing.draw("Red");

        drawing.clear();

        drawing.add(triangle);
        drawing.add(circle);
        drawing.draw("Green");
    }
}
