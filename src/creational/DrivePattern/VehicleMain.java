package creational.DrivePattern;

public class VehicleMain {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle vehicle1 = vehicleFactory.getVehicleType("Car");
        vehicle1.drive();

        Vehicle vehicle2 = vehicleFactory.getVehicleType("BUs");
        vehicle2.drive();

        Vehicle vehicle3 = vehicleFactory.getVehicleType("TRUCK");
        vehicle3.drive();
    }
}
