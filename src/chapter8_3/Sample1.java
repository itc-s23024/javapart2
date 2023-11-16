package chapter8_3;

import java.time.LocalDate;

public class Sample1 {
    public static void main(String[] args) {
        var expDate = LocalDate.of(2026, 3, 31);
        var st = new StudentMember(100, "田中宏", expDate);

        System.out.println("id=" + st.getId());
        System.out.println("name=" + st.getName());
        System.out.println("会員費=" + st.membershipFee());
        System.out.println("期限切れ?=" + st.isExpired());
        System.out.println("有効期限=" + st.getExpireDate());
    }
}
