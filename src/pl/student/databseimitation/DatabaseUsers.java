package pl.student.databseimitation;
import pl.student.repository.Users;
import pl.student.repository.UserType;
import java.util.ArrayList;
import java.util.List;

public class DatabaseUsers {

        List<Users> databaseUsers;

        public DatabaseUsers()
        {
            this.databaseUsers = new ArrayList<Users>();
            this.databaseUsers.add(new Users("admin", "admin", UserType.ADMIN ));
            this.databaseUsers.add(new Users("jkowalski", "password",UserType.PROFESSOR ));
            this.databaseUsers.add(new Users("anowak", "password",UserType.STUDENT ));
            this.databaseUsers.add(new Users("bwozniak", "password",UserType.STUDENT ));
        }

        public List<Users> getData()
        {
            return databaseUsers;
        }

}
