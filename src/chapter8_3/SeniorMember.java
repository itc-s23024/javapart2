package chapter8_3;

import chapter8_1.GeneralMember;

import java.time.LocalDate;

public class SeniorMember extends GeneralMember {
    private LocalDate birthday;

    public SeniorMember(long id, String name, LocalDate birthday) {
        super(id, name);
        this.birthday = birthday;
    }

    @Override
    public int membershipFee() {
        return 700;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
