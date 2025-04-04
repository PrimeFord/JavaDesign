package behavioural.observer;

public class ObserverMain {
    public static void main(String[] args) {
        NewPublisher publisher = new NewPublisher();

        Observer sub1 = new Subscriber("Prime");
        Observer sub2 = new Subscriber("Senpai");

        publisher.addObserver(sub1);
        publisher.addObserver(sub2);

        publisher.notifyObservers("New Manga as been Published");

        publisher.removeObserver(sub1);

        publisher.notifyObservers("Breaking news Update");
    }
}
