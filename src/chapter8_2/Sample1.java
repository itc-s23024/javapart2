package chapter8_2;

public class Sample1 {
    public static void main(String[] args) {
        var lesson = new Lesson("0101", "ゴルフ");
        var gm = new GeneralMember(100, "田中宏", lesson);

        System.out.println(gm.getLession().getLessonName);
    }
}
