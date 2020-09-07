package pl.student.operations;
import java.util.Scanner;

public class EntryPanel {

    private EntryLogic entryLogic;

    public EntryPanel(EntryLogic entryLogic) {
        this.entryLogic = entryLogic;
    }

    protected int getPanel() {

        String name;
        String password;
        int panel = 1;
        Scanner scr = new Scanner(System.in);
        System.out.println("Welcome to StudentCRM. \nPlease provide name");
        name = scr.nextLine();
        System.out.println("Please provide password");
        password = scr.nextLine();
        CurrentlyLogged.setLoggedUser(name);

        try {
            if (entryLogic.verifyCredentials(name, password)) {

                switch (entryLogic.returnTypeForLogin(name)) {
                    case ADMIN:
                        panel = 2;
                        break;

                    case PROFESSOR:
                        panel = 3;
                        break;

                    case STUDENT:
                        panel = 8;
                        break;
                }
            } else {
                System.out.println("Incorrect credentials. Try again.");
                panel = 1;
            }

        } catch (java.lang.NullPointerException e) {
            System.out.println("Incorrect credentials. Try again.");
        }

        return panel;

    }
}
