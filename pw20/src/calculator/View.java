package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame {
    private JTextField inputField;
    private JTextField outputField;
    private JButton calculateButton;

    public View() {
        setTitle("RPN Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        inputField = new JTextField(20);
        outputField = new JTextField(20);
        outputField.setEditable(false);
        calculateButton = new JButton("Calculate");

        add(inputField);
        add(outputField);
        add(calculateButton);

        setSize(300, 150);
    }

    public String getInput() {
        return inputField.getText();
    }

    public void setOutput(double result) {
        outputField.setText(Double.toString(result));
    }

    public void addCalculateListener(ActionListener listener) {
        calculateButton.addActionListener(listener);
    }
}