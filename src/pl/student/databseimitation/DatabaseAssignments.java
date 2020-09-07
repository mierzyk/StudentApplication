package pl.student.databseimitation;

import pl.student.repository.Assignments;

import java.util.ArrayList;
import java.util.List;

public class DatabaseAssignments {

    List<Assignments> databaseAssignemnts;

    public DatabaseAssignments()
    {

        this.databaseAssignemnts = new ArrayList<Assignments>();
        this.databaseAssignemnts.add(new Assignments(1, "anowak"));
        this.databaseAssignemnts.get(0).setGrades(4.5F);
    }

    public List<Assignments> getData()
    {
        return databaseAssignemnts;
    }

}
