package pl.student.operations;

import pl.student.operations.CredentialsLogic;

import java.util.List;
import java.util.Scanner;
import pl.student.Credentials;
import pl.student.operations.UserType;

public class CredentialsAdminPanel {

    private CredentialsLogic credentialsLogic;
    public CredentialsAdminPanel(CredentialsLogic credentialsLogic) {
        this.credentialsLogic = credentialsLogic;
    }

    public int getPanel(List<Credentials> dataSet) {
        String panel;
        int ReturnPanel = 1;
        String type;
        String name;
        String password;
        String message = "What do you wish to do. Type in number:\n 1 logout \n 3 to add new user \n 99 close program \n 4 to check existing accounts details";
        System.out.println(message);
        Scanner scr = new Scanner(System.in);
        panel = scr.nextLine();

        if (panel.equals("1") || panel.contentEquals("99"))

        {
            ReturnPanel = Integer.valueOf(panel);
        } else if (panel.equals("3")) {

            System.out.println("Provide new user's name");
            name = scr.next();

            if (credentialsLogic.checkAccountExistance(dataSet, name)) {
                System.out.println("That login already exists");
                ReturnPanel = 3;
            } else {
                System.out.println("Provide new user's password");
                password = scr.next();

                System.out.println("Provide new user's type of: admin, professor, student");
                type = scr.next();
                if (type.equals(UserType.admin.toString()) || type.equals(UserType.student.toString()) || type.equals(UserType.professor.toString())) {
                    credentialsLogic.addNewAccount(dataSet, type, name, password);
                    System.out.println("new user has been added");
                    ReturnPanel = 2;
                }
                else {
                    System.out.println("No such user's type.");
                    ReturnPanel = 2;
                }
            }
        }
        else if (panel.equals("4")){
            credentialsLogic.getCredentials(dataSet);
            ReturnPanel = 2;
        }
                else {
            System.out.println("incorrect choice");
            System.out.println(message);
        }

        return ReturnPanel;

    }

}
