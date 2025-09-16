public class LectureLoop_3_2_2 {
    public static void main(String[] args) {
        int rightguess = 50;
        int low = 1;
        int high = 100;
        boolean correct = false;
        while (!correct) {
            // användar input som vi ej har lärt oss
            int guess1 = 54;
            System.out.println("Gissningen " + guess1 + " är för hög");
            int guess2 = 46;
            System.out.println(" Gissningen " + guess2 + " är för låg");
            int guess3 = 50;
            if (guess3 == rightguess) {
                System.out.println("Rätt gissning = " + rightguess);
            }
            correct = true;
        }




    }
}
