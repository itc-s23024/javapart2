package chapter8_1;

import java.time.LocalDate;

public class Sample1 {
    public static void main(String[] args) {
        var expireDate = LocalDate.of(2026, 3, 31);
        var st = new StudentMember(100, "田中宏", expireDate);

        System.out.println("id=" + st.getId());
        System.out.println("name=" + st.getName());
        System.out.println("会費=" + st.membershipFee());

        System.out.println("期限切れ?=" + st.isExpired());
        System.out.println("期限日=" + st.getExpireDate());
    }
}
