public class UseTemperature {
    public static void main(String[] args) {
        final String format = "%5.2f градусов по %s\n";

        Temperature temp = new Temperature();
        temp.setNumber(70.0);
        temp.setScale(TempScale.FAHRENHEIT);
        System.out.printf(format, temp.getNumber(), temp.getScale());

        temp = new Temperature(32.0);
        System.out.printf("");
        System.out.printf(format, temp.getNumber(), temp.getScale());


        temp = new Temperature(TempScale.CELSIUS);
        System.out.printf("");
        System.out.printf(format, temp.getNumber(), temp.getScale());


        temp = new Temperature(2.73,TempScale.KELVIN);
        System.out.printf("");
        System.out.printf(format, temp.getNumber(), temp.getScale());

        TemperatureNice temp1 = new TemperatureNice();
        temp1.setNumber(70);
        temp1.setScale(TempScale.FAHRENHEIT);
        System.out.println();
        temp1.display();

        temp1 = new TemperatureNice(32.0);
        temp1.setScale(TempScale.CELSIUS);
        System.out.println();
        temp1.display();

        temp1 = new TemperatureNice(12.0,TempScale.KELVIN);
        System.out.println();
        temp1.display();


        temp1 = new TemperatureNice(TempScale.LEIDEN);
        System.out.println();
        temp1.display();

        System.out.println(2 | 1);
    }
}
