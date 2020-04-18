package part4;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Room {
    private int guests;
    private double rate;
    private boolean smoking;
    private static NumberFormat currently = NumberFormat.getCurrencyInstance(Locale.US);

    public void readRoom(Scanner diskScanner){
        guests = diskScanner.nextInt();
        rate = diskScanner.nextDouble();
        smoking = diskScanner.nextBoolean();
    }

    public void writeRoom(){
        System.out.print(guests);
        System.out.print("\t");
        System.out.print(currently.format(rate));
        System.out.print("\t\t");
        System.out.println(smoking ? "Да" : "Нет");
    }
}
