package abstraction;

public abstract class Shape {

    String shape;
    double area;

    Shape(String shape) {
        this.shape = shape;
    }

    abstract double computeArea();
    abstract double displayArea();
}
