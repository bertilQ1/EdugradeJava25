//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.make ="KIA";
        myCar.model ="Niro";
        myCar.year =2021;
        myCar.startEngine();
        myCar.onRadio();
        myCar.offRadio();

        Motorcycle myMotorcycle = new Motorcycle();
        myMotorcycle.make = "Yamaha";
        myMotorcycle.model = "Roadster";
        myMotorcycle.year = 2023;
        myMotorcycle.startEngine();
        myMotorcycle.popWheelie();

        Truck myTruck = new Truck();
        myTruck.make = "Volvo";
        myTruck.model = "Flatbed";
        myTruck.year = 2025;
        myTruck.startEngine();
        myTruck.onRadio();
        myTruck.offRadio();
        myTruck.stopEngine();
        myTruck.loadCargo();
        myTruck.startEngine();
        myTruck.onRadio();


    }
}


