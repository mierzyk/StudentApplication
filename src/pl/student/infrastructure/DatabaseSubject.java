package pl.student.infrastructure;
import pl.student.model.Subject;
import java.util.ArrayList;
import java.util.List;

public class DatabaseSubject {


    List<Subject> databaseSubjects;

    public DatabaseSubject()
    {
        this.databaseSubjects = new ArrayList<Subject>();
        this.databaseSubjects.add(new Subject("term1","math"));
        this.databaseSubjects.add(new Subject("term2","math"));
        this.databaseSubjects.add(new Subject("term2","physics"));

    }

    public List<Subject> getData()
    {
        return databaseSubjects;
    }
}
