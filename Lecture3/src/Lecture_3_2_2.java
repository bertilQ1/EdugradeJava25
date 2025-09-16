public class Lecture_3_2_2 {
    public static void main(String[] args) {
        int grade = 4;

        switch(grade) {
            case 0:
                System.out.println("Your grade is = F");
                break;
            case 1:
                System.out.println("Your grade is = E");
                break;
            case 2:
                System.out.println("Your grade is = D");
                break;
            case 3:
                System.out.println("Your grade is = C");
                break;
            case 4:
                System.out.println("Your grade is = B");
                break;
            case 5:
                    System.out.println("Your grade is = A");
            default:
                System.out.println("No grade was found at this time, check back later!");
        }
    }
}
