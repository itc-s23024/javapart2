package enum1;

public class Test3 {
    public static void main(String[] args) {
        Season sp = Season.SPRING;
        System.out.println(sp.name());
        System.out.println(sp.ordinal());

        for (Season s : Season.values()){
            System.out.println(s.name());
        }

        //文字列から列挙型に変換する valueOf
        Season winter = Season.valueOf("WINTER");
    }
}
    enum Season{
        SPRING,
        SUMMER,
        FALL,
        WINTER
    }
