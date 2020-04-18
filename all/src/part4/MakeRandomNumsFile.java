package part4;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;

public class MakeRandomNumsFile {
    public static void main(String args[]) throws IOException {
        args = new String[]{"MyNumberedFile. txt", "5"};
        Random generator = new Random();

        if (args.length<2){
            System.out.println("Использование: MakeRandomNumsFile" + " имя_файла число");
            System.exit(1);
        }

        PrintStream printOut = new PrintStream(args[0]);
        int numLines = Integer.parseInt(args[1]);

        for (int count=1; count <=numLines; count++){
            printOut.println(generator.nextInt(10)+1);
        }

    }
}
