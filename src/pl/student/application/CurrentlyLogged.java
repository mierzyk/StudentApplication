package pl.student.application;


public class CurrentlyLogged {
    static String currentlyLogged;

    public static String getLoggedUser() {
        return currentlyLogged;
    }

    public static void setLoggedUser(String name)
    {
        currentlyLogged = name;
    }
}
