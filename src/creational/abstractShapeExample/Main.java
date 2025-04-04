package creational.abstractShapeExample;

public class Main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory();

        Shape shape1=shapeFactory.getShape("Square");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Circle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("Rectangle");
        shape3.draw();
    }
}
