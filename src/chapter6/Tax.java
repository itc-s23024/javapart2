package chapter6;

public class Tax {
    private int number;       // 納税者番号
    private String name;      // 氏名
    private int shotoku;      // 所得額 (income)
    private int koujo;        // 控除額 (deductions)

    public Tax(int number, String name, int shotoku, int koujo) {
        this.number = number;
        this.name = name;
        this.shotoku = shotoku;
        this.koujo = koujo;
    }

    public int zeigaku() {    // 所得税額を計算して返す
        return (int) ((shotoku - koujo) * 0.1);      // int型にキャスト
    }
}
