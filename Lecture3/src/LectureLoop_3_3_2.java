import java.util.Scanner;

public class LectureLoop_3_3_2 {
    public static void main(String[] args) {
        System.out.println("Choose a menu");
        System.out.println("1. - Minus");
        System.out.println("2. + Plus");
        System.out.println("3. * multiplication");
        System.out.println("4. / division");
        System.out.println("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        switch (num) {
            case 1:
                System.out.println("You've chosen -");
                break;
            case 2:
                System.out.println("You've chosen +");
                break;
            case 3:
                System.out.println("You've chosen *");
                break;
            case 4:
                System.out.println("You've chosen /");
                break;
            default:
                System.out.println("You've entered an invalid integer");

        }
    }
}


