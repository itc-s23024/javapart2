package chapter7_9;

public  final class Tax {
    private final Id id;
    private final int shotoku;      // 所得額 (income)
    private final int koujo;        // 控除額 (deductions)

    public Tax(Id id, int shotoku, int koujo) {
        this.id = id;
        this.shotoku = shotoku;
        this.koujo = koujo;
    }

    public int zeigaku() {     // amount of tax
        return (int) ((shotoku - koujo) * 0.1);
    }

    public Id getId() {
        return id;
    }

    public int getShotoku() {
        return shotoku;
    }

    public int getKoujo() {
        return koujo;
    }

    @Override
    public String toString() {
        return "Tax{" +
                "id=" + id +
                ", shotoku=" + shotoku +
                ", koujo=" + koujo +
                '}';
    }
}