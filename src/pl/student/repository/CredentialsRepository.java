package pl.student.repository;
import pl.student.Credentials;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CredentialsRepository implements Repository {


    List<Credentials> credentials;

    public CredentialsRepository() {
        this.credentials = new ArrayList<Credentials>();
        this.credentials.add(new Credentials("admin", "admin", "admin"));
        this.credentials.add(new Credentials("professor", "jan", "kowalski"));
        this.credentials.add(new Credentials("student", "adam", "nowak"));
    }


    @Override
    public Optional<Credentials> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Credentials> getAll() {
        return this.credentials;
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
