package part4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ShowNames {
    public static void main(String[] args) throws IOException {
        ArrayList<String> people = new ArrayList<>();
        Scanner diskScanner = new Scanner(new File("names.txt"));

        while (diskScanner.hasNext()){
            people.add(diskScanner.nextLine());
        }
        people.remove(0);
        people.add(2,"Мезенцева Ольга");

        for (String name : people){
            System.out.println(name);
        }
    }
}
