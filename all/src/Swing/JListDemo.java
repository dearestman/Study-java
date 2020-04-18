package Swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class JListDemo {
    String Cities[] = {"New York","Chicago", "Houston",
                        "Denver", "Los Angeles", "Seattle",
                        "London", "Paris", "New Delhi",
                        "Hong Kong", "Tokyo", "Sydney"};
    public JListDemo(){
        JFrame jfrm = new JFrame("JListDemo");
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(200,200);

        JList<String> jlst = new JList<String>(Cities);
        jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane jscrlp = new JScrollPane(jlst);

        jscrlp.setPreferredSize(new Dimension(120,90));

        JLabel jlab = new JLabel("Chose a city");

        jlst.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int idx = jlst.getSelectedIndex();

                if (idx!=-1){
                    jlab.setText("Current selection: " + Cities[idx]);
                }
                else {
                    jlab.setText("Chose a city");
                }
            }
        });
        jfrm.add(jscrlp);
        jfrm.add(jlab);

        jfrm.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JListDemo();
            }
        });
    }
}
