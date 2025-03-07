package DrivePattern;

class VehicleFactory {
    public Vehicle getVehicleType(String vehicleType){
        if (vehicleType==null){
            return null;
        }

        if(vehicleType.equalsIgnoreCase("Car")){
            return new Car();
        }else if(vehicleType.equalsIgnoreCase("Bus")){
            return  new Bus();
        }else if(vehicleType.equalsIgnoreCase("Truck")){
            return new Truck();
        }
        return null;
    }
}
