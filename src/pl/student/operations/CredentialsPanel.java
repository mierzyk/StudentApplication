package pl.student.operations;
import pl.student.Credentials;
import java.util.List;
import java.util.Scanner;

public class CredentialsPanel {

    private CredentialsLogic credentialsLogic;
    public CredentialsPanel(CredentialsLogic credentialsLogic) {
        this.credentialsLogic = credentialsLogic;
    }

    protected int getPanel(List<Credentials> dataSet) {

        String login;
        String password;
        int panel = 1;
        Scanner scr = new Scanner(System.in);
        System.out.println("Welcome to StudentCRM.\nPlease provide login");
        login = scr.nextLine();
        System.out.println("Please provide password");
        password = scr.nextLine();

        try {
            if (credentialsLogic.verifyCredentials(dataSet, login, password)) {
                System.out.println("login successful");

                switch (credentialsLogic.returnTypeForLogin(dataSet, login)) {
                    case ("admin"):
                        panel = 2;
                        break;
                    case ("professor"):
                        panel = 4;
                        break;
                    case ("student"):
                        panel = 5;
                        break;
                }
            } else {
                System.out.println("login unsuccessful, try again");
                panel = 1;
            }

        } catch (java.lang.NullPointerException e) {
            System.out.println("incorrect login or password");
        }

        return panel;

    }
}
