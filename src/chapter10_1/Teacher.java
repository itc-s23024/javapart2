package chapter10_1;

import exercise.Versionable;

public class Teacher extends User implements Versionable {

    private String url;

    public Teacher(int id, String name, String mail, int role, String url) {
        super(id, name, mail, role);
        this.url = url;
    }

    public String getSubject() {
        return url;
    }


    @Override
    public String version() {
        return "Teacher ver1.0";
    }
}
