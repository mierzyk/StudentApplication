package pl.student.repository;

import pl.student.infrastructure.DatabaseSubject;
import pl.student.model.Subject;

import java.util.List;

//public class SubjectsRepository implements CrudRepository {
public class SubjectsRepository implements CrudRepository<Subject> {

    DatabaseSubject databaseSubjects = new DatabaseSubject();


    @Override
    public Object get() {
        return null;
    }

    @Override
    public List<Subject> getAll() {
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
