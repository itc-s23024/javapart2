package chapter8_1;

import java.time.LocalDate;
import java.util.Locale;

public class StudentMember extends GeneralMember {
    private LocalDate expireDate;

    public StudentMember(long id, String name, LocalDate expireDate) {
        super(id, name);
        this.expireDate = expireDate;
    }

    public boolean isExpired() {
        LocalDate today = LocalDate.now();
        return today.isAfter(expireDate);
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }
}
