package pl.student.infrastructure;
import pl.student.model.User;
import pl.student.model.UserType;
import java.util.ArrayList;
import java.util.List;

public class DatabaseUser {


        List<User> databaseUser;

        public DatabaseUser()
        {
            this.databaseUser = new ArrayList<User>();
            this.databaseUser.add(new User("admin", "admin", UserType.ADMIN ));
            this.databaseUser.add(new User("jkowalski", "password",UserType.PROFESSOR ));
            this.databaseUser.add(new User("anowak", "password",UserType.STUDENT ));
            this.databaseUser.add(new User("bwozniak", "password",UserType.STUDENT ));
        }

        public List<User> getData()
        {
            return databaseUser;
        }

}
