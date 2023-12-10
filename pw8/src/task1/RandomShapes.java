package task1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapes extends JFrame {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 800;
    private static final int SHAPE_COUNT = 20;

    public RandomShapes() {
        setTitle("Random Shapes");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new DrawingPanel());
    }

    private class DrawingPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Random random = new Random();

            for (int i = 0; i < SHAPE_COUNT; i++) {
                int x = random.nextInt(getWidth() - 100) + 50;
                int y = random.nextInt(getHeight() - 100) + 50;
                Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

                if (random.nextBoolean()) {
                    int radius = random.nextInt(50) + 20;
                    g.setColor(color);
                    g.fillOval(x, y, radius, radius);
                } else {
                    int width = random.nextInt(50) + 20;
                    int height = random.nextInt(50) + 20;
                    g.setColor(color);
                    g.fillRect(x, y, width, height);
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RandomShapes randomShapes = new RandomShapes();
            randomShapes.setVisible(true);
        });
    }
}
