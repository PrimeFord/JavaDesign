package facade.smarthome;

public class SmartHomeFacade {
    public static void main(String[] args) {
        SmartHome smartHome = new SmartHome();

        smartHome.activateNightMode();
        smartHome.deactivateNightMode();
    }
}
