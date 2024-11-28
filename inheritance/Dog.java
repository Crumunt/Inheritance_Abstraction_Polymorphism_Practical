package inheritance;

public class Dog extends Animal{
    private String breed;
    private double life_expentancy;

    Dog(String name, double weight, double height, String type, String gender, String breed, double life_expetancy) {
        super.name = name;
        super.weight = weight;
        super.height = height;
        super.type = type;
        super.gender = gender;
        this.breed = breed;
        this.life_expentancy = life_expetancy;
    }

    public String displayAttributes() {
        System.out.println("Name: " + this.name);
        System.out.println("Weight: " + this.weight);
        System.out.println("Height: " + this.height);
        System.out.println("Type: " + this.type);
        System.out.println("Gender: " + this.gender);
        System.out.println("Breed: " + this.breed);
        System.out.println("Life expentancy: " + this.life_expentancy);

        return "Class: " + this.getClass();
    }
}
