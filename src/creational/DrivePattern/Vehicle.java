package creational.DrivePattern;

interface Vehicle{
    void drive();
}

class Car implements Vehicle{
    public void drive() {
        System.out.println("Driving a cool Car");
    }
}

class Bus implements Vehicle{
    public void drive() {
        System.out.println("Driving a cool Bus");
    }
}
class Truck implements Vehicle{
    public void drive() {
        System.out.println("Driving a cool Truck");
    }
}