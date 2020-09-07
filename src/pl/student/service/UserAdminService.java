package pl.student.service;

import pl.student.model.User;
import pl.student.model.UserType;

import java.util.List;

public class UserAdminService {


    private List<User> user;

    public UserAdminService(List<User> user) {

        this.user = user;
    }

    public void getCredentials() {
        System.out.println("type - login - password");
        for(User singleUser : user)
            System.out.println(singleUser.getAccessLevel() + "-" + singleUser.getName() + "-" + singleUser.getPassword());
        System.out.println("\n");
    }


    public void addNewAccount(String name, String password,UserType type) {
        user.add(new User(name, password, type));
    }

    public void removeAccount(String name) {
        for(int i =0; i<user.size(); i++) {
            if(user.get(i).getName().contentEquals(name))
            {
                user.remove(i);
            }
        }
    }


    public boolean checkAccountExistance(String name) {

        boolean existance = false;

        for (User singleUser : user) {
            if (singleUser.getName().contentEquals(name)) {
                existance = true;
                break;
            }
        }
        return existance;
    }

}
