package exercise5;

public class Test3 {
    public static void main(String[] args) {
        /*
        一般的なスポーツの試合人数なｎ人です
        サッカーの試合人数は11人です
         */
        Sports s = new Sports();
        s.display();

        Saccer so = new Saccer();
        so.display();

    }
}

    class Sports {
        String getName() {

            return "一般的なスボーツ";
        }

        void display() {
            System.out.println(getName() + "の試合人数はｎ人です");
        }
    }

    class Saccer extends Sports {
        @Override
        String getName() {

            return "サッカー";
        }

    @Override
    void display() {
        System.out.println(getName() + "の試合人数は11人です");
    }
}

