package exception1;

import java.util.List;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> student = List.of("Mike", "Lisa", "John");

        //生徒の番号を入力したら名前を表示する(標準入力)
        //0:Mike, 1:Lisa, 2:john
        //exitが入力されるまで続ける
        //例外が起きそうな処理を考えて入れる

        System.out.println("生徒の番号を入力しください");
        String n = sc.nextLine();

        int id = Integer.parseInt(n);
        System.out.println(student.get(id));
        //ｎが"0"だったら、Mikeを出力

    }
}
