import java.sql.SQLOutput;

public class Lecture_3_1_3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int c = 20;
        if (a > b && a > c) {
            System.out.println("A is the biggest number");
        } else if (b > a && b > c) {
            System.out.println("B is the biggest number");
        } else {
            System.out.println("C is the biggest number");
        }
    }
}
