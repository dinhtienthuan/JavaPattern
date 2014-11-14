package flyweight;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import flyweight.ShapeFactory.ShapeType;

public class DrawingClient extends JFrame {
    private static final long serialVersionUID = 5571630673252178487L;
    private static final ShapeType SHAPE_TYPES[] = {ShapeType.LINE,
            ShapeType.OVAL_FILL, ShapeType.OVAL_NOFILL};
    private static final Color COLORS[] = {Color.RED, Color.GREEN, Color.YELLOW};

    private final int WIDTH;
    private final int HEIGHT;

    public DrawingClient(int width, int height) {
        WIDTH = width;
        HEIGHT = height;
        Container contentPane = getContentPane();

        JButton startBtn = new JButton("Draw");
        final JPanel panel = new JPanel();

        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(startBtn, BorderLayout.SOUTH);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        startBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics graphics = panel.getGraphics();
                for (int i = 0; i < 20; i++) {
                    Shape shape = ShapeFactory.getShape(getRandomShapeType());
                    shape.draw(graphics, getRandomX(), getRandomY(),
                            getRandomWidth(), getRandomHeight(),
                            getRandomColor());
                }
            }
        });
    }

    protected ShapeType getRandomShapeType() {
        return SHAPE_TYPES[(int) (Math.random() * SHAPE_TYPES.length)];
    }

    protected int getRandomX() {
        return (int) (Math.random() * WIDTH);
    }

    protected int getRandomY() {
        return (int) (Math.random() * HEIGHT);
    }

    protected int getRandomWidth() {
        return (int) (Math.random() * (WIDTH / 10));
    }

    protected int getRandomHeight() {
        return (int) (Math.random() * (HEIGHT / 10));
    }

    protected Color getRandomColor() {
        return COLORS[(int) (Math.random() * COLORS.length)];
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        DrawingClient drawingClient = new DrawingClient(500, 600);
    }
}
