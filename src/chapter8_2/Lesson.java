package chapter8_2;

public class Lesson {
    private String lessonId;
    private String lessonName;

    public Lesson(String lessonId, String lessonName) {
        this.lessonId = lessonId;
        this.lessonName = lessonName;
    }

    public int fee() {
        return 1000;
    }

    public String getLessonId() {
        return lessonId;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonId(String lessonId) {
        this.lessonId = lessonId;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }
}
