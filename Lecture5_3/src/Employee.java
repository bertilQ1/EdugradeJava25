public class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
        this.salary = 0.0;
    }

    public Employee() {
        this.name = "Unknown";
        this.position = "Unknown";
        this.salary = 0.0;
    }

    public void displayEmployee(){
        System.out.println("Your name is " + name + ", your position is " + position + " and your salary is $" + salary );
    }
}
