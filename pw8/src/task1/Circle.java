package task1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class Circle extends Shape {
    private int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getX(), getY(), radius * 2, radius * 2);
    }

    // Дополнительные методы, если необходимо
}