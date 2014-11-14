package composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {
    private List<Shape> groupOfShapes = new ArrayList<Shape>();

    @Override
    public void draw(String fillColor) {
        for (Shape shape : groupOfShapes) {
            shape.draw(fillColor);
        }
    }

    public void add(Shape shape) {
        groupOfShapes.add(shape);
    }
    
    public void remove(Shape shape) {
        groupOfShapes.remove(shape);
    }
    
    public void clear() {
        System.out.println("Clearing all the shapes from drawing");
        groupOfShapes.clear();
    }
}
