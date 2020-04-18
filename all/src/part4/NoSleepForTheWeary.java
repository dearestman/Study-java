package part4;

public class NoSleepForTheWeary {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("I will sleep, just 5 second...");

        takeANap();

        System.out.println("I'm here and have more strenght");
    }

    static void takeANap() throws InterruptedException {
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println("Who did wake up myself?");
        }

    }
}
