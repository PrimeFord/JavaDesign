package creational.AbstractAndInterface;

abstract class AnimalAbstract {
    public abstract void sound();

    public void sleep(){
        System.out.println("The animal is sleeping");
    }
}

class DogAbstract extends AnimalAbstract {
    public void sound(){
        System.out.println("The dog barks");
    }
}

class CatAbstract extends AnimalAbstract {
    public void sound(){
        System.out.println("The cat meows");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        AnimalAbstract myDog = new DogAbstract();
        myDog.sleep();
        myDog.sound();

        AnimalAbstract myCat = new CatAbstract();
        myCat.sound();
        myCat.sleep();
    }
}
