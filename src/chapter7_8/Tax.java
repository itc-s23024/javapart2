package chapter7_8;

public  final class Tax {
    private final int number;       // 納税者番号
    private final String name;      // 氏名
    private final int shotoku;      // 所得額 (income)
    private final int koujo;        // 控除額 (deductions)

    public Tax(int number, String name, int shotoku, int koujo) {
        this.number = number;
        this.name = name;
        this.shotoku = shotoku;
        this.koujo = koujo;
    }

    public int zeigaku() {     // amount of tax
        return (int) ((shotoku - koujo) * 0.1);

    }


    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getShotoku() {
        return shotoku;
    }

    public int getKoujo() {
        return koujo;
    }
}
