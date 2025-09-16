public class Lecture3_2_3 {
    public static void main(String[] args) {
        String meal = "Lunch";
        switch(meal) {
            case "Breakfast":
                System.out.println("For breakfast we recommend : McDonald's Breakfast" );
                break;
            case "Lunch":
                System.out.println("For lunch we recommend : McDonald's Lunch");
                break;
            case "Dinner":
                System.out.println("For dinner we recommend : McDonald's Dinner");
                break;
            default:
                System.out.println("Invalid McDonald's input");

        }
    }
}
