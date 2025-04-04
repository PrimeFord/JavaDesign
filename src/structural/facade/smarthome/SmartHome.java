package structural.facade.smarthome;

class SmartHome {
    private Lights lights;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;

    public SmartHome() {
        this.lights = new Lights();
        this.thermostat = new Thermostat();
        this.securitySystem = new SecuritySystem();
    }

    void activateNightMode(){
        System.out.println("Night Mode Activated");
        lights.turnOff();
        thermostat.adjustTemp(40);
        securitySystem.arm();
    }

    void deactivateNightMode(){
        System.out.println("Night Mode Deactivated");
        lights.turnOff();
        thermostat.adjustTemp(20);
        securitySystem.arm();
    }
}
