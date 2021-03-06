package pl.student.ui;

import pl.student.service.UserProfessorService;

import java.util.Scanner;

public class UserProfessorPanel {

    UserProfessorService service;

    public UserProfessorPanel(UserProfessorService service) {
        this.service = service;
    }

    public int getPanel() {
        String panel;
        Scanner scr = new Scanner(System.in);
        String render = "What do you wish to do. Type in number:"
                + "\n 1 logout"
                + "\n 4 to add new subject-semester pair "
                + "\n 5 to check existing subject-semester pairs \n 6 to add new grades to a student"
                + "\n 7 to check existing grades"
                + "\n 14 to check what students are sighed up for given semester - subject pair"
                + "\n 15 to calculate average grades for a given semester-subject-student";
        System.out.println(render);
        panel = scr.next();
        String semester;
        String subject;
        String name;
        float grade = 0;

        switch (panel) {

            case ("1"):
                panel = "1";
                break;

            case ("4"):
                System.out.println("type in semester name");
                semester = scr.next();
                scr.nextLine();
                System.out.println("type in subject name");
                subject = scr.next();
                scr.nextLine();
                service.addSubjectSemester(semester, subject);
                System.out.println("New semester - subject pair has been added\n");
                panel = "3";
                break;

            case ("5"):
                service.getUniqueSubjectSemesters();
                panel = "3";
                break;

            case ("6"):
                System.out.println("Type in semester name.");
                semester = scr.next();
                if (service.getUnexistingSemester(semester)) {
                    System.out.println("Such semester name does not exist.\n");
                    panel = "3";
                    break;
                }
                System.out.println("Type in subject name.");
                subject = scr.next();
                if (service.getUnexistingSubject(subject)) {
                    System.out.println("Such subject name does not exist.\n");
                    panel = "3";
                    break;
                }
                System.out.println("type in student's name");
                name = scr.next();
                if (service.getUnexistingStudent(name)) {
                    System.out.println("Such student name does not exist.\n");
                    panel = "3";
                    break;
                }
                System.out.println("Please type in grade");
                try {
                    grade = Float.valueOf(scr.next());
                } catch (NumberFormatException e) {
                    System.out.println("Please provide grade as a number");
                }
                service.addNewGrade(semester, subject, name, grade);
                panel = "3";
                break;

            case ("7"):
                System.out.println("Type in semester name.");
                semester = scr.next();
                if (service.getUnexistingSemester(semester)) {
                    System.out.println("Such semester name does not exist.\n");
                    panel = "3";
                    break;
                }
                System.out.println("Type in subject name.");
                subject = scr.next();
                if (service.getUnexistingSubject(subject)) {
                    System.out.println("Such subject name does not exist.\n");
                    panel = "3";
                    break;
                }
                System.out.println("type in student's name");
                name = scr.next();
                if (service.getUnexistingStudent(name)) {
                    System.out.println("Such student name does not exist.\n");
                    panel = "3";
                    break;
                }
                service.showGrades(semester, subject, name);
                panel = "3";
                break;

            case ("14"):
                System.out.println("Type in semester name.");
                semester = scr.next();
                if (service.getUnexistingSemester(semester)) {
                    System.out.println("Such semester name does not exist.\n");
                    panel = "3";
                    break;
                }
                System.out.println("Type in subject name.");
                subject = scr.next();
                if (service.getUnexistingSubject(subject)) {
                    System.out.println("Such subject name does not exist.\n");
                    panel = "3";
                    break;
                }
                service.getSubjectSignUps(semester, subject);
                panel = "3";
                break;

            case ("15"):
                System.out.println("Type in semester name.");
                semester = scr.next();
                if (service.getUnexistingSemester(semester)) {
                    System.out.println("Such semester name does not exist.\n");
                    panel = "3";
                    break;
                }
                System.out.println("Type in subject name.");
                subject = scr.next();
                if (service.getUnexistingSubject(subject)) {
                    System.out.println("Such subject name does not exist.\n");
                    panel = "3";
                    break;
                }
                System.out.println("type in student's name");
                name = scr.next();
                if (service.getUnexistingStudent(name)) {
                    System.out.println("Such student name does not exist.\n");
                    panel = "3";
                    break;
                }
                service.calculateAverageGrade(semester, subject, name);
                panel = "3";
                break;

            default:
                System.out.println("Incorrect choice. Try again\n");
                panel = "3";

        }

        return Integer.valueOf(panel);
    }


}
