package pl.student.operations;



import java.util.*;

public class Classes {

    private String semester;
    private String subject;
    private Map<String, List<Float>> students;

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

    public Set<String> getStudentName() {
        return students.keySet();
    }



    public void setSemesterSubjectStudent(String name) {
        Map<String, List<Float>> tempMap = new HashMap<String, List<Float>>();
        students = tempMap;
        students.put(name,new ArrayList<>());
    }

    public List<Float> getStudentsGrades(String name)
    {
        return students.get(name);
    }

    public void setStudentsGrade(String name, Float grade)
    {
        students.get(name).add(grade);
    }





    public Set<String> getStudents() {
        return this.students.keySet();
    }
/*
    public List<Float> getGrades(String login)
    {
        return this.students.entrySet();
    }
*/


}
