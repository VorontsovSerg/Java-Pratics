package num5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Number5 extends JFrame {
    private Stack<Integer> stack = new Stack<>();
    private JTextArea textArea;
    private JTextField inputField;

    public Number5() {
        setTitle("Number 5");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        textArea = new JTextArea(10, 30);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);
        inputField = new JTextField(30);
        inputField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                processInput(inputField.getText());
                inputField.setText("");
            }
        });
        add(inputField, BorderLayout.SOUTH);
    }

    public void processInput(String input) {
        try {
            int number = Integer.parseInt(input);
            if (number > 0) {
                stack.push(number);
                textArea.append("0\n");
            } else if (number == 0) {
                if (!stack.isEmpty()) {
                    int popped = stack.pop();
                    textArea.append("Извлечено из стека: " + popped + "\n");
                } else {
                    textArea.append("-1\n");
                }
            }
        } catch (NumberFormatException e) {
            textArea.append("Некорректный ввод. Введите целое число.\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Number5 frame = new Number5();
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
