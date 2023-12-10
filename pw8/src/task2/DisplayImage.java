package task2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DisplayImage extends JFrame {

    public DisplayImage(String imagePath) {
        setTitle("Image Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280, 720);

        try {
            BufferedImage image = loadImage(imagePath);
            ImageIcon imageIcon = new ImageIcon(image);
            JLabel label = new JLabel(imageIcon);

            getContentPane().add(label, BorderLayout.CENTER);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private BufferedImage loadImage(String imagePath) throws IOException {
        File file = new File(imagePath);
        return ImageIO.read(file);
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java DisplayImage <image_path>");
            System.exit(1);
        }

        SwingUtilities.invokeLater(() -> {
            DisplayImage displayImage = new DisplayImage(args[0]);
            displayImage.setVisible(true);
        });
    }
}
/*java *путь до DisplayImage.java* *путь до example.jpg*/