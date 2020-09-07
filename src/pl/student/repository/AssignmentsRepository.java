package pl.student.repository;

import pl.student.infrastructure.DatabaseAssignment;
import pl.student.model.Assignment;

import java.util.List;

//public class AssignmentsRepository implements CrudRepository {
public class AssignmentsRepository implements CrudRepository<Assignment> {

    DatabaseAssignment databaseAssignments = new DatabaseAssignment();

    @Override
    public Object get() {
        ;
    }

    @Override
    public List<Assignment> getAll() {
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
