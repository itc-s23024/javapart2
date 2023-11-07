package exercise;

public class Rectangle {
    private double vertical;     // 縦
    private double horizontal;   // 横

    public Rectangle(double vertical, double horizontal) {
        this.vertical = vertical;
        this.horizontal = horizontal;
    }

    public double area() {
        return vertical * horizontal;
    }
}
