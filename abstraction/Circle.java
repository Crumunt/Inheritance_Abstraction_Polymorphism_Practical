package abstraction;

public class Circle extends Shape {

    double radius;
    final double pi = 3.14;

    Circle(String shape, double radius) {
        super(shape);
        this.radius = radius;
        super.area = computeArea();
    }

    public double computeArea() {
        return pi * (radius * radius);
    }

     public double displayArea() {
        return this.area;
    }
}
