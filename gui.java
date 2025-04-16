import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gui {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Your Name: ");
        JOptionPane.showMessageDialog(null, "hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your age"));
        JOptionPane.showMessageDialog(null, "hello " + name + " you are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your height"));
        JOptionPane.showMessageDialog(null, "hello " + name + " you are " + age + " years old and " + height + " centimeters tall");

        JFrame frame = new JFrame("A calculator???");
        frame.setSize(500,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel l1 = new JLabel("Enter the number a: ");
        l1 .setBounds(100, 100, 100, 20);
        frame.add(l1);

        JTextField t1 = new JTextField(10);
        t1.setBounds(201, 100, 100, 20);
        frame.add(t1);

        JLabel l2 = new JLabel("Enter the number b: ");
        l2 .setBounds(100, 150, 100, 20);
        frame.add(l2);

        JTextField t2 = new JTextField(10);
        t2.setBounds(201, 150, 100, 20);
        frame.add(t2);


        JButton btnAdd = new JButton("Add");
        btnAdd.setBounds(100, 180, 80, 20);
        frame.add(btnAdd);

        JButton btnSubtract = new JButton("Subtract");
        btnSubtract.setBounds(190, 180, 100, 20);
        frame.add(btnSubtract);

        JButton btnMultiply = new JButton("Multiply");
        btnMultiply.setBounds(100, 220, 100, 20);
        frame.add(btnMultiply);

        JButton btnDivide = new JButton("Divide");
        btnDivide.setBounds(210, 220, 80, 20);
        frame.add(btnDivide);

        JLabel result = new JLabel("Result: ");
        result.setBounds(100, 270, 250, 20);
        result.setForeground(Color.BLACK);
        frame.add(result);

        btnAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    int n1 = Integer.parseInt(t1.getText());
                    int n2 = Integer.parseInt(t2.getText());
                    int sum = n1 + n2;
                    result.setText("Result: " + sum);
            } catch (NumberFormatException exception){
                result.setText("Please enter valid numbers!!");
            }
            }
        });
        btnSubtract.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    int n1 = Integer.parseInt(t1.getText());
                    int n2 = Integer.parseInt(t2.getText());
                    int diff = n1 - n2;
                    result.setText("Result: " + diff);
                } catch (NumberFormatException ex) {
                    result.setText("Please enter valid numbers!!");
                }
            }
        });

        btnMultiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    int n1 = Integer.parseInt(t1.getText());
                    int n2 = Integer.parseInt(t2.getText());
                    int product = n1 * n2;
                    result.setText("Result: " + product);
                } catch (NumberFormatException ex) {
                    result.setText("Please enter valid numbers!!");
                }
            }
        });

        btnDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    double n1 = Double.parseDouble(t1.getText());
                    double n2 = Double.parseDouble(t2.getText());
                    if (n2 == 0) {
                        result.setText("Cannot divide by zero!!!");
                    } else {
                        double quotient = n1 / n2;
                        result.setText("Result: " + quotient);
                    }
                } catch (NumberFormatException ex) {
                    result.setText("Please enter valid numbers!!");
                }
            }
        });
    }
}