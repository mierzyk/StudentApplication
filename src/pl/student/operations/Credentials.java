package pl.student;

public class Credentials {

    private String type;
    private String login;
    private String password;


    public Credentials(String type, String login, String password) {
        this.type = type;
        this.login = login;
        this.password = password;
    }

    public String getType()
    {
        return this.type;
    }

    public String getLogin()
    {
        return this.login;
    }

    public String getPassword()
    {
        return this.password;
    }

}
