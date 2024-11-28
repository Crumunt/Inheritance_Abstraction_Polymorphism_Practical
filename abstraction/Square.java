package abstraction;

public class Square extends Shape{

    double width;
    double height;

    Square(String shape, double width, double height) {
        super(shape);
        this.width = width;
        this.height = height;
        super.area = computeArea();
    }

    public double computeArea() {
        return width * height;
    }

    public double displayArea() {
        // System.out.println(this.area);;
        return this.area;
    }
}
