package pl.student.repository;

import java.util.List;

public interface CrudRepository<T, I> {

    T get(I id);

    List<T> getAll();

    T save(T o);

    T update(T o);

    void delete(T o);
}
