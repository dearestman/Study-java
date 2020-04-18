package Swing;

import javax.swing.*;
import java.awt.*;

public class FlavorsPanel extends JPanel {
    public FlavorsPanel(){
        JComboBox<String> jcb = new JComboBox<String>();
        jcb.addItem("Vanila");
        jcb.addItem("Chocolate");
        jcb.addItem("Strawberry");
        add(jcb);
    }
}
