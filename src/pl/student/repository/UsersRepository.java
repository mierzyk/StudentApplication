package pl.student.repository;
import pl.student.databseimitation.DatabaseUsers;
import java.util.List;

public class UsersRepository implements CrudRepository<Users> {


    DatabaseUsers databaseUsers = new DatabaseUsers();

    @Override
    public Users get() {
        return null;
    }

    @Override
    public List<Users> getAll() {
        return databaseUsers.getData();
    }

    @Override
    public Users save(Users o) {
        return null;
    }

    @Override
    public Users update(Users o) {
        return null;
    }

    @Override
    public void delete(Users o) {

    }
}
