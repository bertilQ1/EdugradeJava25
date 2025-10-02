public class Podracer {
    private String podName;
    private int podSpeed;
    private int podIntegrity;

    public Podracer(String podName, int podSpeed, int podIntegrity) {
        this.podName = podName;
        this.podSpeed = podSpeed;
        this.podIntegrity = podIntegrity;
    }

    public String getPodName() {
        return podName;
    }

    public int getPodSpeed() {
        return podSpeed;
    }

    public int getPodIntegrity() {
        return podIntegrity;
    }

    public boolean podFunctional() {
        return podIntegrity > 0;
    }

    public void podStatus() {
        System.out.println(podName + ", speed: " + podSpeed + ", Integrity : " + podIntegrity);
    }

    public void podTakeDamage(int damage) {
        podIntegrity -= damage;

        if (podIntegrity > 50) {
            System.out.println( podName + " took " + damage + " damage, " + podName + " is still well off!");
        } else if (podIntegrity > 0) {
            System.out.println(podName + " took " + damage + " damage, " +podName  + " is close to breaking!");
        } else {
            podIntegrity = 0;
        }
        Helper.sleepForMilliSeconds(500);
    }

    public void podSpeedBoost(int amount) {
        if (podFunctional()) {
            podSpeed += amount;
            System.out.println(podName + " uses speed boost and increases their speed to " + podSpeed + "km/h");
        } else {
            System.out.println(podName + " is broken and can't gain any speed");
        }

    }
}

