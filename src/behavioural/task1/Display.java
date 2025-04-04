package behavioural.task1;

public class Display implements Observer {
    private String displayName;
    public Display(String displayName) {
        this.displayName = displayName;
    }
    public void update(float temperature, float humidity, float pressure) {
        System.out.println(displayName +": Temperature =  " + temperature + "c, Humidity = " + humidity + "%, Pressure = " + pressure +"hPa");
    }
}
