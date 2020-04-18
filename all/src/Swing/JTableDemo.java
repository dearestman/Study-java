package Swing;

import javax.swing.*;

public class JTableDemo {
    String[] colHeads = {"Name", "Extension", "ID#"};

    Object[][] data = {
            {"Gail", "4567", "865"},
            {"Ken", "6344", "865"},
            {"Dima", "8678", "865"},
            {"Sara", "3421", "865"},
            {"Ben", "09654", "865"},
            {"Jorge", "9867", "865"},
            {"Grisha", "53453", "865"},
            {"Yura", "8564", "865"},
            {"Serega", "53453", "865"},
    };

    public JTableDemo(){
        JFrame jfrm = new JFrame();
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(300,300);

        JTable table = new JTable(data, colHeads);
        JScrollPane jsp = new JScrollPane(table);

        jfrm.add(jsp);

        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JTableDemo();
            }
        });
    }

}
