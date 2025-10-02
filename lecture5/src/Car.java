public class Car {
    private String make;
    private String model;
    private int year;

    public String getMake() {
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        if (year < 1885){
            System.out.println("Cars werent made in this year");
            return;
        }
        else if (year > 2025) {
            System.out.println("You are not a time traveler, you can't have a car made from this year");
            return;
        }
        this.year = year;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setMake(String make){
        this.make = make;
    }
}

