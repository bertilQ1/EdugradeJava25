//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee fulltime = new FullTimeEmployee("Peter", 5000);
        Employee parttime = new PartTimeEmployee("Janne", 12.5, 150);
        System.out.println(fulltime.name + " Salary is " + fulltime.calculateSalary());
        System.out.println(parttime.name + " Salary is " + parttime.calculateSalary());

        Payable fullTimePayable = new FullTimeEmployee("Peter", 5000);
        Payable partTimePayable = new PartTimeEmployee("Janne", 12.5, 150);

        fullTimePayable.pay();
        partTimePayable.pay();

    }
}
