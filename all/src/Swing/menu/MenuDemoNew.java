package Swing.menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuDemoNew implements ActionListener {
    JLabel jlab;
    JMenuBar jmb;
    JToolBar jtb;
    JPopupMenu jpu;
    DebugAction setAct;
    DebugAction clearAct;
    DebugAction resumeAct;

    MenuDemoNew(){
        JFrame jfrm = new JFrame("MenuDemoNew");
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(360,200);

        jlab = new JLabel();
        jmb = new JMenuBar();
        makeFileMenu();
        makeActions();
        makeToolBar();
        makeOptionsMenu();
        makeHelpMenu();
        makeEdirPUMenu();

        // ввести приемник событий запуска всплывающего меню
        jfrm.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger())
                    jpu.show(e.getComponent(), e.getX(), e.getY());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger())
                    jpu.show(e.getComponent(), e.getX(), e.getY());
            }
        });

        //ввести метку в центре панели содержимого
        jfrm.add(jlab, BorderLayout.CENTER);

        jfrm.add(jtb,BorderLayout.NORTH);

        jfrm.setJMenuBar(jmb);

        jfrm.setVisible(true);
    }


//    Обработать события действия от пунктов меню.
//    Здесь не обрабатываются события генерируемые при выборе режимов отладки в подменю или на панели инструментов Debug

    @Override
    public void actionPerformed(ActionEvent e) {
        String comStr = e.getActionCommand();
        if (comStr.equals("Exit"))
            System.exit(0);
        jlab.setText(comStr + " is selected");
    }

    class DebugAction extends AbstractAction{

        public DebugAction(String name, Icon image, int mnem, int accel, String tTip){
            super(name,image);
            putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(accel, InputEvent.CTRL_DOWN_MASK));
            putValue(MNEMONIC_KEY, mnem);
            putValue(SHORT_DESCRIPTION, tTip);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String comStr = e.getActionCommand();
            jlab.setText(comStr + " is selected");

            if (comStr.equals("Set Breakpoint")){
                clearAct.setEnabled(true);
                setAct.setEnabled(false);
            } else if (comStr.equals("Clear Breakpoint")){
                clearAct.setEnabled(false);
                setAct.setEnabled(true);
            }
        }
    }

    void makeFileMenu(){
        JMenu jmFile= new JMenu("File");
        jmFile.setMnemonic(KeyEvent.VK_F);

        JMenuItem jmiOpen = new JMenuItem("Open", KeyEvent.VK_O);
        jmiOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));

        JMenuItem jmiClose = new JMenuItem("Close", KeyEvent.VK_C);
        jmiClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));

        JMenuItem jmiSave = new JMenuItem("Save", KeyEvent.VK_S);
        jmiSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));

        JMenuItem jmiExit = new JMenuItem("Exit", KeyEvent.VK_E);
        jmiExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));

        jmFile.add(jmiOpen);
        jmFile.add(jmiClose);
        jmFile.add(jmiSave);
        jmFile.add(jmiExit);
        jmb.add(jmFile);

        // ввести приемники действий для пунктов меню File
        jmiOpen.addActionListener(this);
        jmiClose.addActionListener(this);
        jmiSave.addActionListener(this);
        jmiExit.addActionListener(this);

    }

    void makeOptionsMenu(){
        JMenu jmOptions = new JMenu("Options");
        JMenu jmColors = new JMenu("Colors");

        JCheckBoxMenuItem jmiRed = new JCheckBoxMenuItem("Red");
        JCheckBoxMenuItem jmiGreen = new JCheckBoxMenuItem("Green");
        JCheckBoxMenuItem jmiBlue = new JCheckBoxMenuItem("Blue");

        jmColors.add(jmiRed);
        jmColors.add(jmiGreen);
        jmColors.add(jmiBlue);

        jmOptions.add(jmColors);

        JMenu jmPriority = new JMenu("Priority");

        JRadioButtonMenuItem jmiHigh = new JRadioButtonMenuItem("High");
        JRadioButtonMenuItem jmiLow = new JRadioButtonMenuItem("Low");

        jmPriority.add(jmiHigh);
        jmPriority.add(jmiLow);

        jmOptions.add(jmPriority);

        ButtonGroup bg = new ButtonGroup();
        bg.add(jmiHigh);
        bg.add(jmiLow);

        JMenu jmDebug = new JMenu("Debug");
        JMenuItem jmiSetBP = new JMenuItem(setAct);
        JMenuItem jmiClearBP = new JMenuItem(clearAct);
        JMenuItem jmiResume = new JMenuItem(resumeAct);

        jmDebug.add(jmiSetBP);
        jmDebug.add(jmiClearBP);
        jmDebug.add(jmiResume);

        jmOptions.add(jmDebug);

        JMenuItem jmiReset = new JMenuItem("Reset");
        jmOptions.addSeparator();
        jmOptions.add(jmiReset);

        jmb.add(jmOptions);

        jmiRed.addActionListener(this);
        jmiBlue.addActionListener(this);
        jmiGreen.addActionListener(this);
        jmiHigh.addActionListener(this);
        jmiLow.addActionListener(this);
        jmiReset.addActionListener(this);
    }

    void makeHelpMenu(){
        JMenu jmHelp = new JMenu("Help");

        ImageIcon icon = new ImageIcon("about icon.png");

        JMenuItem jmiAbout = new JMenuItem("About", icon);
        jmiAbout.setToolTipText("Info about this program");

        jmHelp.add(jmiAbout);

        jmb.add(jmHelp);
        jmiAbout.addActionListener(this);
    }

    void makeActions() {
        ImageIcon setIcon = new ImageIcon("setbp2.png");
        ImageIcon clearIcon = new ImageIcon("clearbp2.png");
        ImageIcon resumeIcon = new ImageIcon("resume2.jpg");

        setAct = new DebugAction("Set Breakpoint", setIcon, KeyEvent.VK_S, KeyEvent.VK_B, "Set a break point.");
        clearAct = new DebugAction("Clear Breakpoint", clearIcon, KeyEvent.VK_S, KeyEvent.VK_B, "Clear a break point.");
        resumeAct = new DebugAction("Set Breakpoint", resumeIcon, KeyEvent.VK_S, KeyEvent.VK_B, "Resume execution after break point.");

        clearAct.setEnabled(false);
    }

    void makeToolBar(){
        JButton jbtnSet = new JButton(setAct);
        JButton jbtnClear = new JButton(clearAct);
        JButton jbtnResume = new JButton(resumeAct);

        jtb = new JToolBar("Breakpoints");

        jtb.add(jbtnSet);
        jtb.add(jbtnClear);
        jtb.add(jbtnResume);
    }

    void  makeEdirPUMenu(){
        jpu = new JPopupMenu();

        JMenuItem jmiCut = new JMenuItem("Cut");
        JMenuItem jmiCopy = new JMenuItem("Copy");
        JMenuItem jmiPaste = new JMenuItem("Paste");

        jpu.add(jmiCut);
        jpu.add(jmiCopy);
        jpu.add(jmiPaste);

        jmiCut.addActionListener(this);
        jmiCopy.addActionListener(this);
        jmiPaste.addActionListener(this);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuDemoNew();
            }
        });
    }

}


