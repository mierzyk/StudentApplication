package pl.student.repository;

public class Users {

    private String name;
    private String password;
    private UserType accessLevel;

    public Users(String name, String password, UserType accessLevel) {
        this.name = name;
        this.password = password;
        this.accessLevel = accessLevel;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public UserType getAccessLevel() {
        return accessLevel;
    }


}
