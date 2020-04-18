import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ShowGest {
    public static void main(String[] args) throws IOException {
        int guests[] = {1,2,3,1,3,5,6,7,6,7};
//        Scanner diskScanner = new Scanner(new File("GuestList.txt"));
        int roomNum = 0;
        System.out.println("Комната/Количество");
//        for (int numGuests : guests){
//            System.out.print(roomNum++);
//            System.out.print("\t");
//            System.out.println(numGuests);
//        }

        for(int numGuets : guests){
            numGuets +=1;
            System.out.print(numGuets + " ");
        }
        System.out.println();

        for(int numGuets : guests){
            System.out.print(numGuets + " ");
        }


    }
}
