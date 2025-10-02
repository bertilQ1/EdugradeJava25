//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    startRace();

    }

    private static void startRace() {
            Podracer anakin = new Podracer("Anakin Skywalker", 0, 100);
            Podracer sebulba = new Podracer("Sebulba", 0, 100);

            Race race = new Race(anakin, sebulba);
            race.startRace();

    }
}