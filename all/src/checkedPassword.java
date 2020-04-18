import java.util.Scanner;

public class checkedPassword {
    public static void main(String[] args) {
        System.out.println("Введите пароль");
        Scanner keyboard = new Scanner(System.in);
        String password = keyboard.next();
        System.out.println("Вы ввели >>"+password+"<<");
        System.out.println();
        if (password=="swordfish"){
            System.out.println("Этого не должно быть!");
            System.out.println("Введенный и хранящийся пароли");
            System.out.println("Now I will talk on English language! : )");
            System.out.println("they do in different places");
        } else {
            System.out.println("they are!");
            System.out.println("It is two different strings, so");
            System.out.println("Theirs chars can be same.");
        }
        System.out.println();
        if (password.equals("swordfish")){
            System.out.println("It is right password!");
            System.out.println("You can enter in thsi system.");
        }else {
            System.out.println("It is not right password :(");
            System.out.println("try more....");
        }
    }
}
