package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JToggleButtonDemo {
    public  JToggleButtonDemo(){
        JFrame jfrm = new JFrame("JToggleButtonDemo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(200,100);

        JLabel jlab = new JLabel("Button is off");

        JToggleButton jtbn = new JToggleButton("on/off");

        jfrm.add(jtbn);
        jfrm.add(jlab);
        jfrm.setVisible(true);
        //переключатель (нажат ил нет)
        jtbn.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (jtbn.isSelected())
                    jlab.setText("Button is on");
                else
                    jlab.setText("Button is off");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JToggleButtonDemo();
            }
        });
    }
}
