package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo {
    EventDemo () {
        JFrame jFrm = new JFrame("Events in swing");
        jFrm.setSize(300,200);
        jFrm.setLayout(new FlowLayout());
        jFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jbtnAlpha = new JButton("Alpha");
        JButton jbtnBeta = new JButton("Beta");
        JLabel jlab = new JLabel("Click on button!");
        jbtnAlpha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Alpha");
            }
        });
        jbtnBeta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Beta");
            }
        });

        jFrm.add(jbtnAlpha);
        jFrm.add(jbtnBeta);
        jFrm.add(jlab);

        jFrm.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EventDemo();
            }
        });
    }



}
