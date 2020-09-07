package pl.student.repository;
import pl.student.infrastructure.DatabaseUser;
import pl.student.model.User;

import java.util.List;


public class UsersRepository implements CrudRepository<User, String> {


    DatabaseUser databaseUser = new DatabaseUser();

    @Override
    public User get(String id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<User> getAll() {
        return databaseUser.getData();
    }

    @Override
    public User save(User o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public User update(User o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(User o) {
        throw new UnsupportedOperationException();
    }
}
