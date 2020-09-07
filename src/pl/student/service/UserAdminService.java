package pl.student.service;

import pl.student.model.User;
import pl.student.model.UserType;

import java.util.List;

public class UserAdminService {


    private List<User> repository;

    public UserAdminService(List<User> repository) {

        this.repository = repository;
    }

    public void getCredentials() {
        System.out.println("type - login - password");
        for(User singleUser :repository)
            System.out.println(singleUser.getAccessLevel() + "-" + singleUser.getName() + "-" + singleUser.getPassword());
        System.out.println("\n");
    }


    public void addNewAccount(String name, String password,UserType type) {
        repository.add(new User(name, password, type));
    }


    public boolean checkAccountExistance(String login) {

        boolean existance = false;

        for (User singleUser :repository) {
            if (singleUser.getName().contentEquals(login)) {
                existance = true;
                break;
            }
        }
        return existance;
    }

}
