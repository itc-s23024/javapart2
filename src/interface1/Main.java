package interface1;

public class Main {
    public static void main(String[] args) {
        System.out.println("キング:");
        Player player = new King();
        player.setAttack(new Punch());
        player.fight();

        System.out.println();

        //クイーンとナイトも同様に攻撃させる
        //新しいプレイヤーや攻撃方法を追加させる

       System.out.println("クイーン");
        Player player1 = new Queen();
        player1.setAttack(new Kick());
        player1.fight();

        System.out.println();

        System.out.println("ナイト");
        Player player2 = new Knight();
        player2.setAttack(new Punch());
        player2.setAttack(new Kick());
        player2.fight();

        System.out.println();

    }
}
