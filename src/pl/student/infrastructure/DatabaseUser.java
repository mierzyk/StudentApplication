package pl.student.infrastructure;
import pl.student.model.User;
import pl.student.model.UserType;
import java.util.ArrayList;
import java.util.List;

public class DatabaseUser {

        List<User> databaseUsers;

        public DatabaseUser()
        {
            this.databaseUsers = new ArrayList<User>();
            this.databaseUsers.add(new User("admin", "admin", UserType.ADMIN ));
            this.databaseUsers.add(new User("jkowalski", "password",UserType.PROFESSOR ));
            this.databaseUsers.add(new User("anowak", "password",UserType.STUDENT ));
            this.databaseUsers.add(new User("bwozniak", "password",UserType.STUDENT ));
        }

        public List<User> getData()
        {
            return databaseUsers;
        }

}
