package pl.student.repository;

import pl.student.infrastructure.DatabaseSubject;
import pl.student.model.Subject;


import java.util.List;


public class SubjectsRepository implements CrudRepository<Subject, Integer> {

    DatabaseSubject databaseSubject = new DatabaseSubject();


    @Override
    public Subject get(Integer id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Subject> getAll() {
       return databaseSubject.getData();
    }

    @Override
    public Subject save(Subject o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Subject update(Subject o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(Subject o) {
        throw new UnsupportedOperationException();
    }
}
