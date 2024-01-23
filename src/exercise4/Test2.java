package exercise4;

public class Test2 {

    public static byte a;
    public static short b;
    public static int c;
    public static long d;

    public static void main(String[] args) {
        setValue(100);
    }

    public static void setValue(long value){
        a = (byte)value;
        b = (short)value;
        c = (int)value;
        d = value;
    }
}
