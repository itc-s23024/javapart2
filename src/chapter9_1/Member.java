package chapter9_1;

public  abstract class Member {
    private long id;
    private String name;

    protected Member(long id, String name) {
        this.id = id;
        this.name = name;
    }

    protected abstract int fee();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
