package exercise3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Dogオブジェクトを作り、howlingメソッドを呼び出す
        Dog dog1 = new Dog();
        dog1.name = "ジョン";
        dog1.size = 30;
        dog1.howling();

        Dog dog2 = new Dog();
        dog2.name = "チャーリー";
        dog2.size = 15;
        dog2.howling();

        Dog dog3 = new Dog();
        dog3.name = "ワトソン";
        dog3.size = 5;
        dog3.howling();

        //この３匹を配列に入れる
        //for文を使い、吠えるメソッドを呼び出す(配列に使うこと)

        //もしint型の配列ならば
        int[] date = new int[3];
        date[0] = 10;

        Dog[] dogs = new Dog[3];
        dogs[0] = dog1;
        dogs[1] = dog2;
        dogs[2] = dog3;

        for (Dog d : dogs){
            d.howling();
        }

        //Windowクラスのオブジェクトを作り
        //このメインクラスからheightとwedhtを変更できるようにする
        Window w = new Window(10, 100);
        Window w2 = new Window(20, 300);
        w.setHeight(10);
        System.out.println(w.getHeight());
        w.setWidth(100);
        System.out.println(w.getWidth());

        Student s1 = new Student("Mike", 3);
        System.out.println(s1.getName());
        System.out.println(s1.getGrade());

        //Studentクラスのオブジェクトを作る
        //教科を追加するメソッドを呼び出し、
        //登録されている教科を表示する
        s1.tuika( "数学");
        s1.tuika("英語");

        //Studentが登録しているコースを表示する
        System.out.println(s1.getCourses());
        ArrayList<String> cs = s1.getCourses();
        for (String kyoka: cs){
            System.out.println(kyoka);
        }

        Book bk1 = new Book("Java入門", "田中亮", 3900);
        bk1.setTitle("Java入門２");
        System.out.println(bk1.getTitle());

        Book bk2 = new Book("Python入門", "ハミストン", 1500);

        bk1.addBook(bk1);
        System.out.println(bk1.getBookCollection());
        ArrayList<Book> books = bk1.getBookCollection();
        for (Book b : books){
            System.out.println(b);
        }
    }
}
