package chapter10_1;


import java.time.LocalDate;

public class Sample1 {
    public static void main(String[] args) {

        Student student = new Student(10, "田中博",
                "tanaka@mail.jp", 2,
                LocalDate.of(2000, 1, 1));

        if (student instanceof Student) {
            System.out.println("Student型です");
        }
        if (student instanceof Attendable) {
            System.out.println("Attendable型です");
        }
    }
}
