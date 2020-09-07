package pl.student.model;
import java.util.ArrayList;


public class Assignment {

    private int subjectId;
    private String name;
    ArrayList<Float> grades;

    public Assignment(int subjectId, String name) {
        this.subjectId = subjectId;
        this.name = name;
        this.grades = new ArrayList<>();
    }


    public int getSubjectId() {
        return this.subjectId;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Float> getGrades() {
        return this.grades;
    }

    public void setGrades(Float grade) {
        grades.add(grade);
    }


}
