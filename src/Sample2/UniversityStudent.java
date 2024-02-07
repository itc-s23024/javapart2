package Sample2;

public class UniversityStudent extends Student{

    public UniversityStudent(int count){
        lessonCount = count;
    }
    @Override
    public void calcLessonTime() {
        lessonTime = lessonCount * 90;
    }
}
