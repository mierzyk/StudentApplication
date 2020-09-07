package pl.student.repository;

import java.util.List;

public interface CrudRepository<T> {

    T get();

    List<T> getAll();

    T save(T o);

    T update(T o);

    void delete(T o);
}
