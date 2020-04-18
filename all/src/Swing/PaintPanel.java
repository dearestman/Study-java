package Swing;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class PaintPanel extends JPanel {
    Insets ins; //Служит для хранения размеров границ панели

    Random random;

    PaintPanel(){
        setBorder(BorderFactory.createLineBorder(Color.RED, 5)); //размещение рамки вокруг панели и определение ее границ
        random = new Random();
    }

    protected void paintComponent (Graphics g){
        super.paintComponent(g);
        int x, y, x2, y2;

        int height = getHeight();
        int width = getWidth();

        //получить границы объекта
        ins = getInsets();

        for (int i=0; i<10; i++){
            //получение произвольных координат, определяющих конечные точки каждой линии
            x=random.nextInt(width-ins.left);
            y=random.nextInt(height-ins.bottom);
            x2=random.nextInt(width-ins.left);
            y2=random.nextInt(height-ins.bottom);
            //нарисовать линию
            g.drawLine(x,y,x2,y2);
        }

    }
}
class PaintDemo {
    JLabel jlab;
    PaintPanel pp;
    PaintDemo(){
        JFrame jfrm = new JFrame("Paint demo");
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(200,150);

        pp = new PaintPanel();
        jfrm.add(pp);
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PaintDemo();
            }
        });
    }
}
