package chapter11;

public class Main3 {
    public static void main(String[] args) {

//        Addable i = (a, b) -> {
//            return a + b;
//        };
        Addable addable= (a, b) ->  (a + b);

        int total = addable.add(10, 20);
        System.out.println(total);
    }
}
