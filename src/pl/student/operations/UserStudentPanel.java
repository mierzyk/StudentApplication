package pl.student.operations;

import java.util.Scanner;

public class UserStudentPanel {

    UserProfessorStudentLogic logic;

    UserStudentPanel(UserProfessorStudentLogic logic) {
        this.logic = logic;
    }

    public int getPanel() {

        String panel;
        Scanner scr = new Scanner(System.in);
        String render = "What do you wish to do."
                +"\n 1 to logout"
                +"\n 10 to sign up for a subject"
                +"\n 11 to check what subjects are you signed up for"
                +"\n 12 to check your grades"
                +"\n 13 to check existing subjects-semesters pairs";
        System.out.println(render);


        panel = scr.next();
        String semester;
        String subject;

        switch (panel) {
            case ("1"):
                panel = "1";
                break;

            case ("10"):
                System.out.println("provide semester to sign up for");
                semester = scr.next();
                if (logic.getUnexistingSemester(semester)) {
                    System.out.println("Such semester does not exist");
                    panel = "8";
                    break;
                }
                System.out.println("provide subject to sign up for");
                subject = scr.next();
                if (logic.getUnexistingSubject(subject)) {
                    System.out.println("Such subject does not exist");
                    panel = "8";
                    break;
                }
                logic.signUpForSubject(semester, subject);
                panel = "8";
                break;

            case ("11"):
                logic.getStudentSignUps();
                panel = "8";
                break;

            case ("12"):
                System.out.println("provide semester to check grades");
                semester = scr.next();
                if (logic.getUnexistingSemester(semester)) {
                    System.out.println("Such semester does not exist");
                    panel = "8";
                    break;
                }
                System.out.println("provide subject to check grades");
                subject = scr.next();
                if (logic.getUnexistingSubject(subject)) {
                    System.out.println("Such subject does not exist");
                    panel = "8";
                    break;
                }
                logic.showGrades(semester, subject, CurrentlyLogged.getLoggedUser());
                panel = "8";
                break;

            case ("13"):
                logic.getUniqueSubjectSemesters();
                panel = "8";
                break;

            default:
                System.out.println("Incorrect choice. Try again\n");
                panel = "3";

        }

        return Integer.valueOf(panel);
    }


}
