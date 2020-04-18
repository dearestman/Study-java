package Swing;

import javax.swing.*;

public class SwingDemo {
    SwingDemo(){
        JFrame jfrm = new JFrame("A simple swing application");
        jfrm.setSize(300,175);
        jfrm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel jlab = new JLabel("Swing means powerful GUIs");
        jfrm.add(jlab);
        jfrm.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}
