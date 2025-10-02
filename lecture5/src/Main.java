import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* lektion 5.2 Scanner input = new Scanner(System.in);
        Student student1 = new Student();

        System.out.println("Please enter your name");
        student1.setName(input.nextLine());

        System.out.println("Please enter your age");
        student1.setAge(input.nextInt());

        System.out.println("Please enter your grade");
        student1.setGrade(input.next().charAt(0));

        System.out.println("Your name is " + student1.getName() + ", your age is " + student1.getAge() + " and your grade is " + student1.getGrade() + "."); */

        EBook eBook1 = new EBook();
        eBook1.setPublicationyear(1963);
        eBook1.setAuthor("Ronald Mcdonald");
        eBook1.setTitle("Mcdonalds handboken");

        System.out.println(eBook1.getYearPublished());
        System.out.println(eBook1.getAuthor());
        System.out.println(eBook1.getTitle());
















        /* lektion 5.1 System.out.println(calc.add(5, 6));
        System.out.println(calc.subtract(6, 5));
        System.out.println(calc.divide(10,4));
        System.out.println(calc.multiply(10,5));
        System.out.println(calc.modulus(10, 7));

        System.out.println("-----------------------------");

        Rectangle rectangle = new Rectangle();
        double area = rectangle.calcArea(3.0, 2.0);
        double perimeter = rectangle.calcPerimeter(5.5, 6.1);
        System.out.println(area);
        System.out.println(perimeter);

        System.out.println("----------------------");

        MessagePrinter printer = new MessagePrinter();
        printer.printMessage("Yes");
        printer.printMessage("Yes", "No"); */






    }
}