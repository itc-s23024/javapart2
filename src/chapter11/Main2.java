package chapter11;

public class Main2 {
    public static void main(String[] args) {

        //引数１つ　名前　文字列型
        //戻り値　"Hello, 名前" 文字列型
        Greeting g = (name) -> {
            return  "Hello, " + name;
        };

        String s = g.sayHello("Mike");
        System.out.println(s);
    }
}
