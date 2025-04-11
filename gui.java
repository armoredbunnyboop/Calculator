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

        JFrame frame = new JFrame("the hell is this???");
        frame.setSize(500,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel l1 = new JLabel("Enter the number: ");
        l1 .setBounds(100, 100, 100, 20);
        frame.add(l1);

        JTextField t1 = new JTextField(10);
        t1.setBounds(201, 100, 100, 20);
        frame.add(t1);

        JLabel l2 = new JLabel("Enter the number: ");
        l2 .setBounds(100, 150, 100, 20);
        frame.add(l2);

        JTextField t2 = new JTextField(10);
        t2.setBounds(201, 150, 100, 20);
        frame.add(t2);

        JButton btn = new JButton("Add");
        btn.setBounds(100, 200, 100, 20);
        frame.add(btn);

        JLabel result = new JLabel("Result: ");
        result.setBounds(100, 250, 100, 20);
        result.setForeground(Color.BLACK);
        frame.add(result);

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int n1 = Integer.parseInt(t1.getText());
                int n2 = Integer.parseInt(t2.getText());
                int sum = n1 + n2;
                result.setText("Result: " + sum);
            }
        });
    }
}