//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book = new Book("McDonalds 101", "Ronald McDonald", 19.99);
        book.displayInfo();

        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle(5.0, 10.0);

        System.out.println(triangle1.calculateArea());
        System.out.println(triangle2.calculateArea());

        Student student = new Student("Ronald", 'B');
        student.printDetails();

        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Ronald","CEO");
        Employee emp3 = new Employee("Slav42", "Burger flipper", 1000);
        emp2.displayEmployee();
        emp3.displayEmployee();
        emp1.displayEmployee();



    }



}