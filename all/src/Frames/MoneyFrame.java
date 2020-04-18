package Frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;

public class MoneyFrame extends JFrame implements KeyListener, ItemListener, MouseListener {

    private static final long serialVersion = 1L;

    JLabel fromCurrencyLabel = new JLabel(" ");
    JTextField textField = new JTextField(5);
    JLabel label = new JLabel("         ");
    JComboBox combo = new JComboBox();

    NumberFormat currencyUS = NumberFormat.getCurrencyInstance(Locale.US);
    NumberFormat currencyUK = NumberFormat.getCurrencyInstance(Locale.UK);

    public MoneyFrame(){
        setLayout(new FlowLayout());
        add(fromCurrencyLabel);
        add(textField);
        combo.addItem("Dollar to pound");
        combo.addItem("Pound to dollar");
        add(label);
        add(combo);

        textField.addKeyListener(this);
        combo.addItemListener(this);
        label.addMouseListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(300,100);
        setVisible(true);
    }

    void setTextOnLabel(){
        String amountString = "";
        String fromCurrency = "";

        try {
            double amount = Double.parseDouble(textField.getText());

            if (combo.getSelectedItem().equals("Dollar to pound")){
                amountString = " = " + currencyUK.format(amount*0.61214);
                fromCurrency = "$";
            } if (combo.getSelectedItem().equals("Pound to dollar")){
                amountString = " = " + currencyUS.format(amount*1.63361);
                fromCurrency = "\u00A3";
            }
        }catch (NumberFormatException err){

        }
        label.setText(amountString);
        fromCurrencyLabel.setText(fromCurrency);


    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        setTextOnLabel();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent k) {
        setTextOnLabel();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent m) {
        label.setForeground(Color.red);
    }

    @Override
    public void mouseExited(MouseEvent m) {
        label.setForeground(Color.black);
    }
}
