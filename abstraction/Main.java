package abstraction;

public class Main {

    public static void main(String[] args) {
         Circle cirkol = new Circle("Circle", 100);
         Square skwer = new Square("Square", 100, 50);
         Triangle trayangol = new Triangle("Triangle", 10, 20);

         System.out.println(skwer.shape + " area: " + skwer.displayArea());
         System.out.println(trayangol.shape + " area: " +trayangol.displayArea());
         System.out.println(cirkol.shape + " area: " + cirkol.displayArea());
    }

}
