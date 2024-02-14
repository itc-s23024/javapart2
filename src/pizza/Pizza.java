package pizza;

public abstract class Pizza {
    //フィールドは何が必要か？
    int id;  //ピザのID
    String name;  //ピザの名前
    int price;  //ピザの値段

    public void bake(){
        System.out.println(name +"を作っています...");
    }

    public void cut(){
        System.out.println(name + "をカットしています...");
    }

    public void boxing(){
        System.out.println("を箱に入れています...");
    }
}
