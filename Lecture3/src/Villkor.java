public class Villkor {
    public static void main(String[] args) {
        System.out.println("Villkor");
        int calc = 5;
        if (calc == 15){
            System.out.println("It meets the requirement of 15");
        } else {
            while (calc != 15)
                calc = calc + 1;
                System.out.println("Added 1 onto calc = " + calc);
            }



    }
}
