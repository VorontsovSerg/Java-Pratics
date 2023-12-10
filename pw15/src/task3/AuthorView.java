package task3;

import javax.swing.*;

import javax.swing.*;

public class AuthorView {
    private JFrame frame;
    private JLabel nameLabel;
    private JLabel ageLabel;

    public AuthorView() {
        frame = new JFrame("Author Details");
        frame.setSize(200, 200);

        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 30, 200, 20);

        ageLabel = new JLabel("Age:");
        ageLabel.setBounds(20, 60, 200, 20);

        frame.setLayout(null);
        frame.add(nameLabel);
        frame.add(ageLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void setAuthorDetails(String name, int age) {
        nameLabel.setText("Имя: " + name);
        ageLabel.setText("Возраст: " + age);
    }
}
