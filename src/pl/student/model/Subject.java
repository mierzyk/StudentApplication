package pl.student.model;

public class Subject {
    private String semester;
    private String subject;
    public static int currentId;
    private int subjectsId;

    public Subject(String semester, String subject) {
        this.semester = semester;
        this.subject = subject;
        this.subjectsId = ++currentId;

    }

    public String getSemester() {
        return semester;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getsubjectsId() {
        return this.subjectsId;
    }


}
