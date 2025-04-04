package behavioural.task1;

import behavioural.Observer;
import behavioural.User;

public class WeatherMain {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Display phone = new Display("Phone Display");
        Display tv = new Display("TV Display");
        Display web = new Display("Web Display");


        weatherStation.registerObserver(phone);
        weatherStation.registerObserver(tv);
        weatherStation.registerObserver(web);

        weatherStation.notifyObservers(25.0f,74.3f,1010.2f);

        weatherStation.removeObserver(web);

        weatherStation.notifyObservers(2.0f,7.3f,110.2f);


    }
}
