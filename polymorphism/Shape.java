package polymorphism;

public class Shape {
    private double area;

    public int computeArea(int param1) {

        return param1 * param1;
    }

    public int computeArea(int param1, int param2) {
        return param1 * param2;
    }

    public int computeArea(int param1, int param2, int param3) {
        return ((param1 + param2) / 2) * param3;
    }
}
