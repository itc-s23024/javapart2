package exception1;

public class Lesson1 {
    public static void main(String[] args) {
        String str = null;
        if (str == null){
            System.out.println("エラーです");
        }else{
            System.out.println(str.length());
        }

//        try {
//            System.out.println(str.length());
//        }catch (NullPointerException e){
//            System.out.println("NullPointerExceptionが発生しました");
//        }

//        String str = "abc";
//        try {
//            System.out.println(Integer.parseInt(str));
//        }catch (NumberFormatException e){
//            System.out.println("文字列の値が不正です");
//        }

       //ArrayIndexOutOfBoundsException
       // この例外が起きそうな文を考えて、例外処理を入れてください
//        try {
//            int[] arr = new int[3];
//            arr[5] = 10;
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("配列の範囲外です");
//        }
    }
}
/*

     try{
     例外が発生しそうな処理

     }catch(キャッチする例外の型と変数){
     　例外が発生したときの処理
     }

 */