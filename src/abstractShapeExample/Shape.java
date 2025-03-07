package abstractShapeExample;

interface Shape{
    void draw();
}

class Rectangle implements Shape{
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing Square");
    }
}