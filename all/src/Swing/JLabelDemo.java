package Swing;

import javax.swing.*;

public class JLabelDemo {
    JLabelDemo(){
        JFrame jFrame = new JFrame("Test remake from JApplets.");
        jFrame.setSize(200,150);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon imageIcon = new ImageIcon("love.png");

        JLabel jLabel = new JLabel("It is my \"Love\"", imageIcon, JLabel.CENTER);

        jFrame.add(jLabel);
        jFrame.setVisible(true);


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JLabelDemo();
            }
        });
    }

}
