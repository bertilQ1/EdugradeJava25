public class PartTimeEmployee extends Employee implements Payable {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void pay() {
        System.out.println("Paying out " + name + " their salary of " + calculateSalary());
    }
}