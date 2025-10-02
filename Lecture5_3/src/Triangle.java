public class Triangle {
    private double base;
    private double height;

    public Triangle() {
        this.base = 1.0;
        this.height = 1.0;
    }
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
}
