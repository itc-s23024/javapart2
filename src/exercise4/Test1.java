package exercise4;

public class Test1 {
    public static void main(String[] args) {
        //byte 1
        //short 2
        //char 2
        //int 4
        //float 4
        //double 8
        //long 8

        byte a = 5;
        short b = a;
        int c = a + b;
        long d = c * c;

        double d2 = 10.5;
        //この値をint型の変数に入れる
        int i2 = (int) d2;
        System.out.println(i2);

        //-128~127
        byte b1 = 110;
        byte b2 = 120;
        //110*120 = 13200
        byte b3 = (byte) (b1 * b2);
        System.out.println(b3);
        //-112
    }
}
