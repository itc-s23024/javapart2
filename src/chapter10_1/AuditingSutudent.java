package chapter10_1;

import exercise.Versionable;

public class AuditingSutudent extends User implements Attendable, Versionable {
    private int subjectId;

    public AuditingSutudent(int id, String name, String mail, int role, int subjectId) {
        super(id, name, mail, role);
        this.subjectId = subjectId;
    }

    public int getSubjectId() {
        return subjectId;
    }

//    @Override
//    public void writeAttendance() {
//        System.out.println("聴講科目の出席報告を完了しました");
//    }

    @Override
    public void writeAttendance() {
       System.out.println("聴講科目の出席報告を完了しました");
    }

    @Override
    public void readAttendance() {
        System.out.println("聴講科目の出席情報を読み込みました");

    }

    @Override
    public String version() {
        return "AuditingStudent ver1.0";
    }
}
