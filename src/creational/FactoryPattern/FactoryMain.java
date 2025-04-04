package creational.FactoryPattern;

public class FactoryMain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("Square");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("CiRclE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("rectangle");
        shape3.draw();

    }
}
