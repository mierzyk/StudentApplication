package pl.student.operations;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Classes {

    private String semester;
    private String subject;
    private Map<String, ArrayList<Float>> students;

    public Classes(String semester,String subject)
    {
        this.semester = semester;
        this.subject = subject;
    }

    public Classes() {

    }

    public String getSemester()
    {
        return this.semester;
    }

    public String getSubject()
    {
        return this.subject;
    }

    public int getMapSize()
    {
        return this.students.size();
    }

    public ArrayList<Float> getStudentsGrades(String name)
    {
        return students.get(name);
    }

    public void setSemesterSubjectStudent(String name) {
        students.put(name,null);
    }


/*

    public Set<String> getStudents() {
        return this.students.keySet();
    }

    public List<Float> getGrades(String login)
    {
        return this.students.entrySet();
    }
*/


}
