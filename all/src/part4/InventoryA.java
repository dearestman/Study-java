package part4;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;

public class InventoryA {
    public static void main(String[] args) {
        final double boxPrice = 3.25;
        boolean gotGoodInput = false;
        Scanner keyboard = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();



        do {
            try{
                System.out.println("Сколько коробок вы насчитали?");
                String numBoxesIn = keyboard.nextLine();
                int numBoxes = Integer.parseInt(numBoxesIn);

                if (numBoxes<0)
                    throw new OutOfRangeException();
                if (numBoxes>1000)
                    throw new NumberTooLargeException();
                System.out.print("All summ = ");
                System.out.println(currency.format(numBoxes * boxPrice));
                gotGoodInput=true;
                throw new IOException();


            }catch (NumberFormatException e){
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
//            System.out.println("It is not integer");
            } catch (NumberTooLargeException e){
                System.out.println("error: value more then 1000");
            } catch (OutOfRangeException e){
                System.out.println("error: value less then 0");
                e.printStackTrace();
            } catch (IOException e) {
                System.out.println("End.");
            }
        }while (!gotGoodInput);



    }
}
