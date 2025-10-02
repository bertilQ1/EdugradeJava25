public class FullTimeEmployee extends Employee implements  Payable{
    double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary){
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
    @Override
    public void pay(){
        System.out.println("Paying out " + name + " their salary of " + calculateSalary());

    }
}
