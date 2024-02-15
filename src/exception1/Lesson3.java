package exception1;

public class Lesson3 {
    public static void main(String[] args) {
        try {
            genrerateNumber();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    static void genrerateNumber() throws Exception{
        //int number = (int) (Math.random()*100);
        int number = 13;
        if (number == 13){
            throw new Exception("アンラッキー");
        }
    }
}
