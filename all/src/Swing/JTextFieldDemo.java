package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JTextFieldDemo {
    JTextFieldDemo(){

        JFrame jFrame = new JFrame("Testing Text Field.");
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(260,120);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel label = new JLabel("When have you born?");

        JTextField jTextField = new JTextField( 10);
        JButton jButton = new JButton("accept");

        JLabel result = new JLabel("result");

        jFrame.add(label);
        jFrame.add(jTextField);
        jFrame.add(jButton);
        jFrame.add(result);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int todayYear = 2020;
                int bornDate = Integer.parseInt(jTextField.getText());
                String dateResult;
                dateResult = String.valueOf(todayYear-bornDate);
                result.setText("Your age is near " + dateResult);
            }
        });

        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JTextFieldDemo();
            }
        });
    }
}
