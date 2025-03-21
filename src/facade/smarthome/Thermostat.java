package facade.smarthome;

class Thermostat {
    void adjustTemp(int temp){
        boolean condition = true;
        String level = (temp > 30) ? "Raising Thermostat" : "Lowering Thermostat";
        System.out.println(level+" to " +temp  + " degrees");
    }
}
