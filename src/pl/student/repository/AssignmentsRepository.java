package pl.student.repository;

import pl.student.infrastructure.DatabaseAssignment;
import pl.student.model.Assignment;

import java.util.List;

//public class AssignmentsRepository implements CrudRepository {
public class AssignmentsRepository implements CrudRepository<Assignment, Integer> {

    DatabaseAssignment databaseAssignment = new DatabaseAssignment();


    @Override
    public Assignment get(Integer id) {
        return null;
    }

    @Override
    public List<Assignment> getAll() {
        return databaseAssignment.getData();
    }

    @Override
    public Assignment save(Assignment o) {
        return null;
    }

    @Override
    public Assignment update(Assignment o) {
        return null;
    }

    @Override
    public void delete(Assignment o) {

    }
}

