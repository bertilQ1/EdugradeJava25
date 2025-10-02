//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape myCircle = new Circle(2);
        Shape myRectangle = new Rectangle(2,3);

        System.out.println(myRectangle.calculateArea());
        System.out.println(myCircle.calculateArea());

        Playable myGuitar = new Guitar();
        Playable myPiano = new Piano();

        myPiano.play();
        myGuitar.play();

    }
}
