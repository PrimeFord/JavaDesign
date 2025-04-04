package creational.AbstractAndInterface;

interface Animal {
    void sound();

    default void sleep() {
        System.out.println("The animal is sleeping");
    }
}

interface AnimalTwo{
    void jump();
}


class Dog implements Animal, AnimalTwo {
    public void sound() {
        System.out.println("The dog barks");
    }

    public void jump(){
        System.out.println("The dog jumps");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
        myDog.sleep();

        AnimalTwo myDog2 = new Dog();
        myDog2.jump();
    }
}
