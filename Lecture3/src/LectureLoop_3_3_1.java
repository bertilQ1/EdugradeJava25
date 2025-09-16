import java.sql.SQLOutput;
import java.util.Scanner;

public class LectureLoop_3_3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please don't write something negative");
        int number;
        do {
            number = input.nextInt();
            System.out.println("You wrote " + number);
        } while (number >= 0);
        input.close();
        System.out.println("You wrote something negative, i will shut myself off");
    }
}
