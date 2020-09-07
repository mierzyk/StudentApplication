package pl.student.infrastructure;
import pl.student.model.Subject;
import java.util.ArrayList;
import java.util.List;

public class DatabaseSubject {


    List<Subject> databaseSubject;

    public DatabaseSubject()
    {
        this.databaseSubject = new ArrayList<Subject>();
        this.databaseSubject.add(new Subject("term1","math"));
        this.databaseSubject.add(new Subject("term2","math"));
        this.databaseSubject.add(new Subject("term2","physics"));

    }

    public List<Subject> getData()
    {
        return databaseSubject;
    }
}
