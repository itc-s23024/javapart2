package enum1;

public class Test6 {
    public static void main(String[] args) {
        /*
        商品データを登録する
        パソコン、　ORDERED
        スマートフォン、　SHIPPED

        商品一覧を表示する
         */
        Item[] items = {
                new Item("パソコン", ItemStatus.ORDERED),
                new Item("スマートフォン", ItemStatus.SHIPPED),
                new Item("テレビ", ItemStatus.DELIVERED),
                new Item("掃除機", ItemStatus.CANCELLED),
        };

        for (Item item:items){
            System.out.println(item.getName() + ":" + item.getStatus().getJp());
        }
    }
}
/*
商品の状態
注文完了、発送完了、お届け完了、キャンセル
 */
class Item{
    private String name;    //商品名
    private ItemStatus status;

    public Item(String name, ItemStatus status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemStatus getStatus() {
        return status;
    }

    public void setStatus(ItemStatus status) {
        this.status = status;
    }
}

enum ItemStatus{
    ORDERED("注文完了"),
    SHIPPED("発送完了"),
    DELIVERED("お届け完了"),
    CANCELLED("キャンセル");

    private final String jp;

    ItemStatus(String jp){
        this.jp =jp;
    }
    public String getJp(){
        return this.jp;
    }
}