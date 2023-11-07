package exercise;

public class E621_3 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(12.3, 2.34);
        Rectangle r2 = new Rectangle(12.3, 34.5);
        Rectangle r3 = new Rectangle(12.3, 45.8);

        System.out.printf("面積=%.2f%n", r1.area());
        System.out.printf("面積=%.2f%n", r2.area());
        System.out.printf("面積=%.2f%n", r3.area());
    }
}
