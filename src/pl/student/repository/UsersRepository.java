package pl.student.repository;
import pl.student.infrastructure.DatabaseUser;
import pl.student.model.User;

import java.util.List;

//public class UsersRepository implements CrudRepository<Users> {
public class UsersRepository implements CrudRepository<User> {


    DatabaseUser databaseUsers = new DatabaseUser();

    @Override
    public User get() {
        return null;
    }

    @Override
    public List<User> getAll() {
        return databaseUsers.getData();
    }

    @Override
    public User save(User o) {
        return null;
    }

    @Override
    public User update(User o) {
        return null;
    }

    @Override
    public void delete(User o) {

    }
}
