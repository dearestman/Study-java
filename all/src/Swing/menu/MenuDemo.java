package Swing.menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuDemo implements ActionListener {
    JLabel jlab;
    JPopupMenu jpm;

    public  MenuDemo(){
        JFrame jfrm = new JFrame("MenuDemo");
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(220,200);

        jlab = new JLabel();
        jlab.setToolTipText("THis is a label!");

        JMenuBar jmb = new JMenuBar();

        JMenu jmFile = new JMenu("File");
        jmFile.setMnemonic(KeyEvent.VK_F);

        JMenuItem jmiOpen = new JMenuItem("Open");
        jmiOpen.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK
        ));

        JMenuItem jmiClose = new JMenuItem("Close");
        jmiClose.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK
        ));
        JMenuItem jmiSave = new JMenuItem("Save");
        jmiSave.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK
        ));
        JMenuItem jmiExit = new JMenuItem("Exit");
        jmiExit.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK
        ));
        jmFile.add(jmiOpen);
        jmFile.add(jmiClose);
        jmFile.add(jmiSave);
        jmFile.addSeparator();
        jmFile.add(jmiExit);
        jmb.add(jmFile);

        JMenu jmOptions = new JMenu("Options");
        JMenu jmColors = new JMenu("Colors");

        JCheckBoxMenuItem jmiCRed = new JCheckBoxMenuItem("Red");
        JCheckBoxMenuItem jmiCGreen = new JCheckBoxMenuItem("Green");
        JCheckBoxMenuItem jmiCBlue = new JCheckBoxMenuItem("Blue");
//        JMenuItem jmiCRed = new JMenuItem("Red");
//        JMenuItem jmiCBlue = new JMenuItem("Blue");
//        JMenuItem jmiCGreen = new JMenuItem("Green");
        jmColors.add(jmiCRed);
        jmColors.add(jmiCGreen);
        jmColors.add(jmiCBlue);
        jmOptions.add(jmColors);



        JMenu jmPriority = new JMenu("Priority");
        JCheckBoxMenuItem jmiPHigh = new JCheckBoxMenuItem("High", true);
        JCheckBoxMenuItem jmiPLow = new JCheckBoxMenuItem("Low");
//        JMenuItem jmiPHigh = new JMenuItem("High");
//        JMenuItem jmiPLow = new JMenuItem("Low");
        jmPriority.add(jmiPHigh);
        jmPriority.add(jmiPLow);
        jmOptions.add(jmPriority);

        ButtonGroup bg = new ButtonGroup();
        bg.add(jmiPHigh);
        bg.add(jmiPLow);

        JMenuItem jmiReset = new JMenuItem("Reset");
        jmOptions.addSeparator();
        jmOptions.add(jmiReset);

        jmb.add(jmOptions);

        JMenu jmHelp = new JMenu("Help");
        ImageIcon iconAbout = new ImageIcon("about icon.png");
        JMenuItem jmiAbout = new JMenuItem("About", iconAbout);
        jmiAbout.setToolTipText("Info about the MenuDemo program");
        jmHelp.add(jmiAbout);
        jmb.add(jmHelp);

        jmiOpen.addActionListener(this);
        jmiClose.addActionListener(this);
        jmiSave.addActionListener(this);
        jmiExit.addActionListener(this);
        jmiCRed.addActionListener(this);
        jmiCBlue.addActionListener(this);
        jmiCGreen.addActionListener(this);
        jmiPHigh.addActionListener(this);
        jmiPLow.addActionListener(this);
        jmiReset.addActionListener(this);
        jmiAbout.addActionListener(this);


        jfrm.add(jlab, BorderLayout.CENTER);

        JToolBar jtb = new JToolBar("Debug");

        ImageIcon set = new ImageIcon("setbp.png");
        ImageIcon clear = new ImageIcon("clearbp.png");
        ImageIcon resume = new ImageIcon("resume.png");

        JButton jbtnSet = new JButton(set);
        jbtnSet.setActionCommand("Set Breakpoint");
        jbtnSet.setToolTipText("Set Breakpoint");

        JButton jbtnClear = new JButton(set);
        jbtnClear.setActionCommand("Clear Breakpoint");
        jbtnClear.setToolTipText("Clear Breakpoint");

        JButton jbtnResume = new JButton(set);
        jbtnClear.setActionCommand("resume");
        jbtnClear.setToolTipText("resume");

        jtb.add(jbtnSet);
        jtb.add(jbtnClear);
        jtb.add(jbtnResume);

        jfrm.add(jtb, BorderLayout.NORTH);

        jbtnSet.addActionListener(this);
        jbtnClear.addActionListener(this);
        jbtnResume.addActionListener(this);

        DebugActions setAct = new DebugActions("Set Breakpoint", set, KeyEvent.VK_S, KeyEvent.VK_B, "Set a Breakpoint");
        DebugActions clearAct = new DebugActions("Clear Breakpoint", clear, KeyEvent.VK_C, KeyEvent.VK_L, "Clear a Breakpoint");
        DebugActions resumeAct = new DebugActions("Resume", clear, KeyEvent.VK_C, KeyEvent.VK_L, "REsume execution after a Breakpoint");

        clearAct.setEnabled(false);

        jbtnSet = new JButton("setAct");
        jbtnClear = new JButton("clearAct");
        jbtnResume = new JButton("resumeAct");

        jtb = new JToolBar("Breakpoints");

        jtb.add(jbtnSet);
        jtb.add(jbtnClear);
        jtb.add(jbtnResume);

        jfrm.add(jtb, BorderLayout.NORTH);


        JMenu jmDebug = new JMenu("Debug");
        JMenuItem jmiSetBP = new JMenuItem(setAct);
        JMenuItem jmiClearBP = new JMenuItem(clearAct);
        JMenuItem jmiResume = new JMenuItem(resumeAct);
        jmDebug.add(jmiSetBP);
        jmDebug.add(jmiClearBP);
        jmDebug.add(jmiResume);
        jmOptions.add(jmDebug);



        jpm = new JPopupMenu();
        JMenuItem jmiCut = new JMenuItem("Cut");
        JMenuItem jmiCopy = new JMenuItem("Copy");
        JMenuItem jmiPaste = new JMenuItem("Paste");

        jpm.add(jmiCut);
        jpm.add(jmiCopy);
        jpm.add(jmiPaste);

        jmiCut.addActionListener(this);
        jmiCopy.addActionListener(this);
        jmiPaste.addActionListener(this);

        jfrm.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (me.isPopupTrigger())
                    jpm.show(me.getComponent(),me.getX(),me.getY());
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                if (me.isPopupTrigger())
                    jpm.show(me.getComponent(), me.getX(),me.getY());
            }
        });


        jfrm.setJMenuBar(jmb);

        jfrm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String comString = ae.getActionCommand();



        if (comString.equals("Exit")) System.exit(0);

        jlab.setText(comString + " is selected");


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuDemo();
            }
        });
    }
    class DebugActions extends AbstractAction {
        public DebugActions(String name, Icon image, int mnem, int accel, String tTip){
            super(name, image);
            putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(accel, InputEvent.CTRL_DOWN_MASK));
            putValue(MNEMONIC_KEY, mnem);
            putValue(SHORT_DESCRIPTION, tTip);
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}

