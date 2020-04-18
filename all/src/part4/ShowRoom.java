package part4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ShowRoom {
    public static void main(String[] args) throws IOException {
        Room rooms[];
        rooms= new Room[10];

        Scanner diskScanner = new Scanner(new File("Roomlist.txt"));

        for (int roomNum=0; roomNum<10; roomNum++){
            rooms[roomNum] = new Room();
            rooms[roomNum].readRoom(diskScanner);
        }
        System.out.println("Комната\tКолич.\tТариф\t\t" + "Для курящих");
        for (int roomNum=0; roomNum<10; roomNum++){
            System.out.print(roomNum);
            System.out.print("\t");
            rooms[roomNum].writeRoom();
        }


    }
}
