package polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape ship = new Shape();

        System.out.println("1 Argument: " + ship.computeArea(1));
        System.out.println("2 Arguments: " + ship.computeArea(1, 10));
        System.out.println("3 Arguments: " + ship.computeArea(1, 10, 100));
    }
}
