import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TeamFrame extends JFrame {
    public TeamFrame() throws IOException {
        PlayerPlus player;
        Scanner keyboard = new Scanner(new File("Hankees.txt"));

        for (int num = 1; num <= 9; num++){
            player = new PlayerPlus(keyboard.nextLine(), keyboard.nextDouble());
            keyboard.nextLine();
            addPlayerInfo(player);
        }

        add(new JLabel());
        add(new JLabel(" ------"));
        add(new JLabel("Средний бэттинг команды:"));
        add(new JLabel(PlayerPlus.findTeamAverageString()));

        setTitle("Средние бэттинги Ханков");
        setLayout(new GridLayout(11,2,20,3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    void addPlayerInfo(PlayerPlus player){
        add(new JLabel(" " + player.getName()));
        add(new JLabel(player.getAverageString()));
    }
}
