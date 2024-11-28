package inheritance;

public class Employee extends Human {
    private double salary;
    private String company_name;
    private String position;
    private int hours_per_week;

    Employee(String name, double weight, double height, double salary, String civil_status, String gender ,String company_name, String position, int hours_per_week) {
        super.name = name;
        super.weight = weight;
        super.height = height;
        this.salary = salary;
        super.civil_status = civil_status;
        super.gender = gender;
        this.company_name = company_name;
        this.position = position;
        this.hours_per_week = hours_per_week;
    }

    public String displayAttributes() {
        System.out.println("Name: " + this.name);
        System.out.println("Weight: " + this.weight);
        System.out.println("Height: " + this.height);
        System.out.println("Salary: " + this.salary);
        System.out.println("Civil Status: " + this.civil_status);
        System.out.println("Gender: " + this.gender);
        System.out.println("Company Name: " + this.company_name);
        System.out.println("Position: " + this.position);
        System.out.println("Hours Per Week: " + this.hours_per_week);

        return "Class: " + this.getClass();
    }
}
