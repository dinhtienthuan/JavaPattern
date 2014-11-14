package test;

import bridge.Green;
import bridge.Pentagon;
import bridge.Red;
import bridge.Shape;
import bridge.Triangle;

public class BridgePatternTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle(new Red());
        triangle.applyColor();
        
        Shape pentagon = new Pentagon(new Green());
        pentagon.applyColor();
    }
}
