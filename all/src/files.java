
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class files {
    public static void main(String args[]) throws IOException {
        Scanner scannerName = new Scanner(new File("test.txt"));

        scannerName.nextLine();
        scannerName.nextLine();
        scannerName.next();
        scannerName.nextLine();
    }
}
