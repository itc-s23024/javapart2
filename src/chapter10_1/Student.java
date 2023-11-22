package chapter10_1;

import exercise.Versionable;

import java.time.LocalDate;

public class Student extends User implements Attendable, Versionable {

    private LocalDate expDate;

    public Student(int id, String name, String mail, int role, LocalDate expDate) {
        super(id, name, mail, role);
    }

    public boolean isExpired() {
        LocalDate today = LocalDate.now();
        return today.isAfter(expDate);
    }

    public LocalDate getExpDate() {
        return expDate;
    }


    @Override
    public void writeAttendance() {

    }

    @Override
    public void readAttendance() {

    }

    @Override
    public String version() {
        return "Student var1.0";
    }
}
