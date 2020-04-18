import javax.swing.*;
import java.awt.*;

public class SimpleFrame extends JFrame {
    public SimpleFrame(){
        setTitle("Не щелкайте по кнопке!");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new JButton("Щелкните на меня!"));
        setSize(300,100);
        setVisible(true);
    }
}
