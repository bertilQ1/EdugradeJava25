public class Race {
    private Podracer racer1;
    private Podracer racer2;

    public Race(Podracer racer1, Podracer racer2){
        this.racer1 = racer1;
        this.racer2 = racer2;
    }

    public void startRace() {
        System.out.println("Starting Podrace between " + racer1.getPodName() + "and " + racer2.getPodName() + "!");

        int round = 1;

        while (racer1.podFunctional() && racer2.podFunctional()) {
            System.out.println(" ---- Round " + round + " ---- ");

            racer1.podSpeedBoost(Helper.randomInt());
            racer2.podSpeedBoost(Helper.randomInt());

            racer1.podTakeDamage(Helper.randomInt());
            racer2.podTakeDamage(Helper.randomInt());

            racer1.podStatus();
            racer2.podStatus();

            round++;

            if (round > 100){
                break;
            }
            Helper.sleepForMilliSeconds(1000);
        }

        if (!racer1.podFunctional() && !racer2.podFunctional()) {
            System.out.println("Both " + racer1 + " and " + racer2 + " has crashed, no one wins!");
        } else if (!racer1.podFunctional()){
            System.out.println(racer1.getPodName() + " has crashed, " + racer2.getPodName() + " has won!");
        } else if (!racer2.podFunctional()) {
            System.out.println(racer2.getPodName() + " has crashed, " + racer1.getPodName() + " has won!");
        } else {
            System.out.println("Error, something went wrong!");

        }
    }
}
