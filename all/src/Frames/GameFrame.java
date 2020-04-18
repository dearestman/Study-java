package Frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class GameFrame extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;

    int randomNumber = new Random().nextInt(10)+1;
    int numGuesses = 0;

    JTextField textField = new JTextField(10);
    JButton button = new JButton("Сделай попытку");
    JLabel label = new JLabel(numGuesses + " попыток");

    public GameFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(textField);
        add(button);
        add(label);
        button.addActionListener(this);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) throws NumberFormatException{


            try{
                String textFieldText = textField.getText();
                if (Integer.parseInt(textFieldText)<0 | Integer.parseInt(textFieldText)>10)
                    throw new NumberNotInRange();
                if (Integer.parseInt(textFieldText)==randomNumber){
                    button.setEnabled(false);
                    textField.setText(textField.getText() + ", yeah! You are right!");
                    textField.setEnabled(false);
                }else {
                    textField.setText("");
                    textField.requestFocus();
                }

                numGuesses++;
                String guessWord = (numGuesses ==1) ?  " try" : " tries";
                label.setText(numGuesses + guessWord);

            } catch (NumberNotInRange err){
                System.out.println("Is is not in range.");
                textField.setText("");
                textField.requestFocus();
            } catch (NumberFormatException err){
                System.out.println("It is not integer.");
                textField.setText("");
                textField.requestFocus();
//                err.printStackTrace();
            }


    }
}