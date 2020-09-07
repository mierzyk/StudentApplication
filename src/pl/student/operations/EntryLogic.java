package pl.student.operations;
import pl.student.repository.Users;
import pl.student.repository.UserType;
import java.util.List;

public class EntryLogic {


    private List<Users> repository;

    public EntryLogic(List<Users> repository) {
        this.repository = repository;
    }


    public boolean verifyCredentials(String login, String password) {


        boolean returnValue = false;
        for (Users singleUsers : repository) {
            if (singleUsers.getName().contentEquals(login) && singleUsers.getPassword().contentEquals(password)) {
                returnValue = true;
                break;

            }
        }
        return returnValue;
    }


    public UserType returnTypeForLogin(String login) {
        UserType returnValue = UserType.STUDENT;
        for (Users singleUsers : repository) {
            if (singleUsers.getName().contentEquals(login)) {
                returnValue = singleUsers.getAccessLevel();
                break;
            }
        }
        return returnValue;
    }


}
