package chapter11;

public class Main {
    public static void main(String[] args) {
//        Line line = new Line();
//        line.draw();

          //匿名クラス
//        Drawable d = new Drawable() {
//            @Override
//            public void draw() {
//                System.out.println("Hello");
//            }
//        };

        //ラムダ式
        Drawable d = () -> {
            System.out.println("Hello");
        };
        d.draw();
    }
}
