package pl.student.service;
import pl.student.model.User;
import pl.student.model.UserType;
import java.util.List;

public class EntryService {


    private List<User> user;


    public EntryService(List<User> repository) {
        this.user = repository;
    }


    public boolean verifyCredentials(String login, String password) {


        boolean returnValue = false;
        for (User singleUser : user) {
            if (singleUser.getName().contentEquals(login) && singleUser.getPassword().contentEquals(password)) {
                returnValue = true;
                break;
            }
        }
        return returnValue;
    }


    public UserType returnTypeForLogin(String login) {
        UserType returnValue = UserType.STUDENT;
        for (User singleUser : user) {
            if (singleUser.getName().contentEquals(login)) {
                returnValue = singleUser.getAccessLevel();
                break;
            }
        }
        return returnValue;
    }


}
