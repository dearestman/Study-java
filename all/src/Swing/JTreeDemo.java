package Swing;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class JTreeDemo {
    JTreeDemo (){
        JFrame jfrm = new JFrame("JTreeDemo");
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(200,250);

        //создаем самый верхний узел дерева
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Options");

        //создать поддерево "А"
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
        top.add(a);
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A_1");
        a.add(a1);
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A_2");
        a.add(a2);

        //создать поддерево "B"
        DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
        top.add(b);
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B_1");
        b.add(b1);
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B_2");
        b.add(b2);
        DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("B_3");
        b.add(b3);

        JTree tree = new JTree(top);

        JScrollPane jsp = new JScrollPane(tree);
        jfrm.add(jsp);


        //вывод метки на панель содержимого
        JLabel jlab = new JLabel();
        jfrm.add(jlab, BorderLayout.SOUTH);

        tree.addTreeSelectionListener((new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent tse) {
                jlab.setText("Selection is " + tse.getPath());
            }
        }));

        jfrm.setVisible(true);


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JTreeDemo();

            }
        });
    }
}
class JadenCase {

    public String toJadenCase(String phrase) {
        // TODO put your code below this comment
        char[] symbols_of_phrase = phrase.toCharArray();
        for (int i=0; i<=symbols_of_phrase.length-1; i++){
            
        }
            return null;
    }

}