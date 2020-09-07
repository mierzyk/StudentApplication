package pl.student.infrastructure;

import pl.student.model.Assignment;

import java.util.ArrayList;
import java.util.List;

public class DatabaseAssignment {

    List<Assignment> databaseAssignment;

    public DatabaseAssignment()
    {

        this.databaseAssignment = new ArrayList<Assignment>();
        this.databaseAssignment.add(new Assignment(1, "anowak"));
        this.databaseAssignment.get(0).setGrade(4.5F);
    }

    public List<Assignment> getData()
    {
        return databaseAssignment;
    }

}
