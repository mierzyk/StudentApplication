package pl.student.operations;

import pl.student.repository.Users;
import pl.student.repository.UserType;

import java.util.List;

public class UserAdminLogic {


    private List<Users> repository;

    public UserAdminLogic(List<Users> repository) {

        this.repository = repository;
    }

    public void getCredentials() {
        System.out.println("type - login - password");
        for(Users singleUsers :repository)
            System.out.println(singleUsers.getAccessLevel() + "-" + singleUsers.getName() + "-" + singleUsers.getPassword());
        System.out.println("\n");
    }


    public void addNewAccount(String name, String password,UserType type) {
        repository.add(new Users(name, password, type));
    }


    public boolean checkAccountExistance(String login) {

        boolean existance = false;

        for (Users singleUsers :repository) {
            if (singleUsers.getName().contentEquals(login)) {
                existance = true;
                break;
            }
        }
        return existance;
    }

}
