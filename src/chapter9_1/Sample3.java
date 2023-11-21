package chapter9_1;

import java.time.LocalDate;

public class Sample3 {
    public static void main(String[] args) {

//        Member m1 = new StudentMember(
//                200, "木村一郎",
//                LocalDate.of(2026, 3, 31)
//        );

        Member m1 = new SeniorMember(
                150, "鈴木浩二",
                        LocalDate.of(1960, 3, 31)
        );

        if (m1 instanceof StudentMember) {
            StudentMember sm = (StudentMember) m1;
            System.out.println("期限日=" + sm.getExpireDate());
        }
        if (m1 instanceof StudentMember stm) {
            System.out.println("期限日=" + stm.getExpireDate());
        }

        // 追加の検証
        Object o = new GeneralMember(200, "木村一郎");

        if (o instanceof Member m2) {
            System.out.println("名前=" + m2.getName());
        }
    }
}
