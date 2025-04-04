package creational.abstractShapeExample;

public class FactoryProducer {
    static  AbstractFactory getFactory(){
        return new ShapeFactory();
    }
}
