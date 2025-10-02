//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.multiply(2, 2));
        System.out.println(calc.multiply(2.3, 2.4));

        Shape myCircle = new Circle();
        Shape myRectangle = new Rectangle();

        myCircle.draw();
        myRectangle.draw();

        Printer myPrinter = new Printer();
        myPrinter.print(44);
        myPrinter.print(4.2);
        myPrinter.print("Hellow");

        Printer myColorPrinter = new ColorPrinter();
        myColorPrinter.print("Hellow");
    }
}