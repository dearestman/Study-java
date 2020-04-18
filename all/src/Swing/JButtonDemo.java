package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonDemo implements ActionListener {
    JLabel jlab;
    JButtonDemo(){
        JFrame jfrm = new JFrame("JButtonDemo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(500,400);

        //ввести кнопки на панели содержимого
        ImageIcon vk1 = new ImageIcon("vk.png");
        JButton jb = new JButton(vk1);
        jb.setActionCommand("VK1");
        jb.addActionListener(this);
        jfrm.add(jb);

        ImageIcon vk2 = new ImageIcon("vk.png");
        jb = new JButton(vk2);
        jb.setActionCommand("VK2");
        jb.addActionListener(this);
        jfrm.add(jb);

        ImageIcon vk3 = new ImageIcon("vk.png");
        jb = new JButton(vk3);
        jb.setActionCommand("VK3");
        jb.addActionListener(this);
        jfrm.add(jb);

        ImageIcon vk4 = new ImageIcon("vk.png");
        jb = new JButton(vk4);
        jb.setActionCommand("VK4");
        jb.addActionListener(this);
        jfrm.add(jb);

        jlab = new JLabel("Chose a Timepiece");
        jfrm.add(jlab);

        jfrm.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        jlab.setText("You selected " + ae.getActionCommand());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JButtonDemo();
            }
        });
    }
}
