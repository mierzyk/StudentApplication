package pl.student.repository;

import pl.student.databseimitation.DatabaseAssignments;

import java.util.List;

public class AssignmentsRepository implements CrudRepository {

    DatabaseAssignments databaseAssignments = new DatabaseAssignments();

    @Override
    public Object get() {
        return null;
    }

    @Override
    public List<Assignments> getAll() {
        return databaseAssignments.getData();
    }

    @Override
    public Object save(Object o) {
        return null;
    }

    @Override
    public Object update(Object o) {
        return null;
    }

    @Override
    public void delete(Object o) {

    }
}
