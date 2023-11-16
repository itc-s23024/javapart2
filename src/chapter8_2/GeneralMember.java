package chapter8_2;

public class GeneralMember {
    private long id;
    private String name;
    private Lesson lesson;

    public int fee() {
        return lesson.fee();
    }

    public String getLessonId() {
        return lesson.getLessonId();
    }

    public String getLessonName() {
        return lesson.getLessonName();
    }

    public GeneralMember(long id, String name, Lesson lesson) {
        this.id = id;
        this.name = name;
        this.lesson = lesson;
    }

    public int membershipFee() {
        return  1000;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
