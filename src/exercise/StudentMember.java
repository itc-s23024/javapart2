package exercise;

import java.time.LocalDate;

public class StudentMember extends Member {
    private LocalDate expireDate;

    public StudentMember(long id, String name, LocalDate expireDate) {
        super(id, name);
        this.expireDate = expireDate;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    @Override
    public int fee() {
        return 500;
    }

    public boolean isExpired() {
        return LocalDate.now().isAfter(expireDate);
    }
}
