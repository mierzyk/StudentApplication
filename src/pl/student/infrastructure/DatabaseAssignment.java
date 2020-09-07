package pl.student.infrastructure;

import pl.student.model.Assignment;

import java.util.ArrayList;
import java.util.List;

public class DatabaseAssignment {

    List<Assignment> databaseAssignemnts;

    public DatabaseAssignment()
    {

        this.databaseAssignemnts = new ArrayList<Assignment>();
        this.databaseAssignemnts.add(new Assignment(1, "anowak"));
        this.databaseAssignemnts.get(0).setGrades(4.5F);
    }

    public List<Assignment> getData()
    {
        return databaseAssignemnts;
    }

}
