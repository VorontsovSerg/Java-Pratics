package task3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;

public class Animation extends JFrame {
    private JLabel animationLabel;
    private Timer timer;
    private int currentFrame = 1;
    private static final int TOTAL_FRAMES = 8; // Замените на количество кадров в вашей анимации

    public Animation() {
        setTitle("Анимация");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);

        ImageIcon initialImage = new ImageIcon(getImage("frame1.jpg"));
        animationLabel = new JLabel(initialImage);
        add(animationLabel);

        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateAnimation();
            }
        });
        timer.start();
    }

    private void updateAnimation() {
        currentFrame++;
        if (currentFrame > TOTAL_FRAMES) {
            currentFrame = 1;
        }

        ImageIcon newImage = new ImageIcon(getImage("frame" + currentFrame + ".jpg"));
        animationLabel.setIcon(newImage);
    }

    private Image getImage(String filename) {
        return new ImageIcon(getClass().getResource(filename)).getImage();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Animation animation = new Animation();
            animation.setVisible(true);
        });
    }
}