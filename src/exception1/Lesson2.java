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

        while (true){
            System.out.println("生徒の番号を入力しください");
            String n = sc.nextLine();
            if (n.equals("exit")){
                break;
            }

            try {
                int id = Integer.parseInt(n);
                System.out.println(student.get(id));

            }catch (NumberFormatException e){
                System.out.println("入力値不正です");

            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("該当する生徒は存在しません");
            }

            System.out.println("abc");
        }



    }
}
