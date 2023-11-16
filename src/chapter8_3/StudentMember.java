package chapter8_3;

import chapter8_1.GeneralMember;

import java.time.LocalDate;

public class StudentMember extends GeneralMember {
    private LocalDate expireDate;

    public StudentMember(long id, String name, LocalDate expireDate) {
        super(id, name);
        this.expireDate = expireDate;
    }

    @Override
    public int membershipFee() {     //オーバーライド
        return 500;
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
