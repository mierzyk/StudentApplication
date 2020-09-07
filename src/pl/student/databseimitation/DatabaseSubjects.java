package pl.student.databseimitation;
import pl.student.repository.Subjects;
import java.util.ArrayList;
import java.util.List;

public class DatabaseSubjects {


    List<Subjects> databaseSubjects;

    public DatabaseSubjects()
    {
        this.databaseSubjects = new ArrayList<Subjects>();
        this.databaseSubjects.add(new Subjects("term1","math"));
        this.databaseSubjects.add(new Subjects("term2","math"));
        this.databaseSubjects.add(new Subjects("term2","physics"));

    }

    public List<Subjects> getData()
    {
        return databaseSubjects;
    }
}
