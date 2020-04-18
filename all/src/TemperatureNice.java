public class TemperatureNice extends Temperature {
    public TemperatureNice(){
        super();
    }
    public TemperatureNice(double number){
        super(number);
    }
    public TemperatureNice(TempScale scale){
        super(scale);
    }
    public TemperatureNice(double number, TempScale scale){
        super(number, scale);
    }

    public void display(){
        System.out.printf("%5.2f градусов по %s",getNumber(), getScale());
    }
}
