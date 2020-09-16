package pl.student.repository;

import pl.student.infrastructure.DatabaseAssignment;
import pl.student.model.Assignment;

import java.util.List;

//public class AssignmentsRepository implements CrudRepository {
public class AssignmentsRepository implements CrudRepository<Assignment, Integer> {

    DatabaseAssignment databaseAssignment = new DatabaseAssignment();


    @Override
    public Assignment get(Integer id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Assignment> getAll() {
        return databaseAssignment.getData();
    }

    @Override
    public Assignment save(Assignment o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Assignment update(Assignment o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(Assignment o) { throw new UnsupportedOperationException(); }
}

