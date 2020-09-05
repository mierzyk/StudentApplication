package pl.student.repository;

import pl.student.Credentials;
import pl.student.operations.Classes;

import java.util.List;
import java.util.Optional;

public class ClassesRepository implements Repository {

    List<Classes> classes;

    public ClassesRepository()
    {
        classes.add(new Classes("term1","statistics"));
        classes.add(new Classes("term1","social science"));
        classes.add(new Classes("term2","social science"));
        classes.add(new Classes("term3","statistics"));
    }

    @Override
    public Optional get(long id) {
        return Optional.empty();
    }

    @Override
        public List<Classes> getAll() {
        return this.classes;
    }

    @Override
    public void save(Object o) {

    }

    @Override
    public void update(Object o, String[] params) {

    }

    @Override
    public void delete(Object o) {

    }
}
