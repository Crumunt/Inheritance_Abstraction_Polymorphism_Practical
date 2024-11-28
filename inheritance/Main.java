package inheritance;

public class Main {

    public static void main(String[] args) {
        Dog dug = new Dog("BawBaw", 32, 80, "Dog", "Male", "Tibetan Mastiff", 5);

        Employee impuluyii = new Employee("Sasaki", 45, 175, 250000, "Single", "Male", "Smoek", "Vice President", 30);


        System.out.println(impuluyii.displayAttributes());
        System.out.println("==========================================");
        System.out.println(dug.displayAttributes());

    }
}
