package abstraction;

public class Triangle extends Shape{

    double base;
    double height;
    final double tri = 0.5;

    Triangle(String shape, double base, double height) {
        super(shape);
        this.base = base;
        this.height = height;
        super.area = computeArea();
    }


    public double computeArea() {
        return (tri * base * height);
    }

     public double displayArea() {
        // System.out.println(this.area);;
        return this.area;
    }

}
