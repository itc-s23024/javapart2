package chapter8_1;

import chapter8_2.Lesson;

public class GeneralMember {
    private long id;
    private String name;
    private Lesson lesson;

    public GeneralMember(long id, String name) {
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

    public int fee() {
        return lesson.fee();
    }

    public String getLessonId() {
        return lesson.getLessonId();
    }

    public String getLessonName() {
        return lesson.getLessonName();
    }
}
