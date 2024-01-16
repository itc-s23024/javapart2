package exercise2;

public class Test4 {
    public static void main(String[] args) {
        String password = "ab5dd";
        if (password_check(password)) {
            System.out.println("正しい");
        }else{
            System.out.println("誤りがあります");
        }
    }

    //変数passwordが5文字以上かどうかチェックするメソッドを作る
    //引数:password
    //戻り値:boolean(正しいときtrue)

    public static boolean password_check(String password) {
        if (password.length() < 5) {
            return false;
        }

        //英字が2文字以上入っているか？入っていたらtrueで返す
        //isLetterメソッドを使う

        //数字が2文字以上入っているか？入っていたらtrueで返す
        //isLetterメソッドと同様にその文字が数字かチェックするメソッドを作る

        int lettercnt = 0;
        int numericcnt = 0;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (isLetter(c)) {
                lettercnt++;
            }
            if (isNumeric(c)){
                numericcnt++;
            }
        }

        if (lettercnt >= 2 && numericcnt >= 2) {
            return true;
        } else {
            return false;
        }
    }

    //英字かどうか？
        public static boolean isLetter(char ch) {
            ch = Character.toUpperCase(ch);
            if (ch >= 'A' && ch <= 'Z') {
                return true;
            } else {
                return false;
            }
        }

        //数字かどうか?
        public static boolean isNumeric(char ch){
        if (ch >= '0' && ch <= '9'){
            return true;
        }else{
            return false;
        }
        }

        }

