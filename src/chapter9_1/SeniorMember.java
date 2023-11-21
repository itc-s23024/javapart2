package chapter9_1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class SeniorMember extends Member {
    private LocalDate birthday;

    public SeniorMember(long id, String name, LocalDate birthday) {
        super(id, name);
        this.birthday = birthday;
    }

    @Override
    protected int fee() {
        return age() >= 70 ? 300 : 700;
    }

    public int age() {
        var today =LocalDate.now();
        return (int) (ChronoUnit.YEARS.between(birthday,today));
    }
}
