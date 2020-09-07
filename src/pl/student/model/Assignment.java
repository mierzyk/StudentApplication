package pl.student.model;
import java.util.ArrayList;


public class Assignment {

    private int subjectId;
    private String name;
    ArrayList<Float> grade;

    public Assignment(int subjectId, String name) {
        this.subjectId = subjectId;
        this.name = name;
        this.grade = new ArrayList<>();
    }


    public int getSubjectId() {
        return this.subjectId;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Float> getGrade() {
        return this.grade;
    }

    public void setGrade(Float grade) {
        this.grade.add(grade);
    }


}
