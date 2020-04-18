package Swing;

import javax.swing.*;
import java.awt.*;

public class ColorsPanel extends JPanel {
    public  ColorsPanel(){
        JCheckBox cb1 = new JCheckBox("Red");
        add(cb1);
        JCheckBox cb2 = new JCheckBox("Green");
        add(cb2);
        JCheckBox cb3 = new JCheckBox("Blue");
        add(cb3);


    }
}
