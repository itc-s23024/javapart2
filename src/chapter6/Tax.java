package chapter6;

import java.util.Objects;

public class Tax {
    private int number;       // 納税者番号
    private String name;      // 氏名
    private int shotoku;      // 所得額 (income)
    private int koujo;        // 控除額 (deductions)

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShotoku() {
        return shotoku;
    }

    public void setShotoku(int shotoku) {
        this.shotoku = shotoku;
        if (koujo > this.shotoku) {
            //設定済みの控除額より所得額が下回ったら調整する。
            koujo = this.shotoku;
        }
    }

    public int getKoujo() {
        return koujo;
    }

    public void setKoujo(int koujo) {
        if (shotoku < koujo) {
            // koujo が shotoku を上回ってしまったら
            // this.koujo は shoyoku と同じ値で設定する。
            this.koujo = shotoku;
        } else {
            this.koujo = koujo;
        }
    }

    @Override
    public String toString() {
        return "Tax{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", shotoku=" + shotoku +
                ", koujo=" + koujo +
                '}';
    }

    public Tax(int number, String name, int shotoku, int koujo) {
        this.number = number;
        this.name = name;
        this.shotoku = shotoku;
        this.koujo = koujo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tax tax = (Tax) o;
        return number == tax.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    public int zeigaku() {    // 所得税額を計算して返す
        return (int) ((shotoku - koujo) * 0.1);      // int型にキャスト
    }
}
