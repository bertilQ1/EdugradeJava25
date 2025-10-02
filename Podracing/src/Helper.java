public class Helper {
    public static int randomInt(){
        return (int) Math.round(Math.random()* 20);
    }

    public static void sleepForMilliSeconds(int time) {
        try {
            Thread.sleep(time);
        } catch(InterruptedException e) {
            e.printStackTrace();  // vi hanterar eventuella avbrott
        }
    }
}
