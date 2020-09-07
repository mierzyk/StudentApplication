package pl.student.repository;

import pl.student.databseimitation.DatabaseSubjects;

import java.util.List;
import java.util.Set;

public class SubjectsRepository implements CrudRepository {

    DatabaseSubjects databaseSubjects = new DatabaseSubjects();


    @Override
    public Object get() {
        return null;
    }

    @Override
    public List<Subjects> getAll() {
        return databaseSubjects.getData();
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
