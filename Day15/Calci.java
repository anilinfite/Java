package Day15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calci extends JFrame {
    private JTextField num1Field;
    private JTextField num2Field;
    private JLabel resultLabel;

    public Calci() {
        setTitle("Calculator");
        setSize(350, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("First Number:"));
        num1Field = new JTextField();
        add(num1Field);

        add(new JLabel("Second Number:"));
        num2Field = new JTextField();
        add(num2Field);

        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(num1Field.getText());
                    double b = Double.parseDouble(num2Field.getText());
                    resultLabel.setText("Sum: " + (a + b));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid numbers");
                }
            }
        });
        add(addButton);

        resultLabel = new JLabel("Result: ");
        add(resultLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calci();
            }
        });
    }
}
