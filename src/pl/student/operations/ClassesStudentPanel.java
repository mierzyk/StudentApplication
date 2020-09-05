package pl.student.operations;

import pl.student.repository.ClassesRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ClassesStudentPanel {

    ClassesLogic logic;

    ClassesStudentPanel(ClassesLogic logic) {
        this.logic = logic;

    }



    public int getPanel(List<Classes> dataSet) {

        String panel;
        Scanner scr = new Scanner(System.in);
        String render = "What do you wish to do. \n 1 to logout \n 10 to sign up for a subject \n 11 to check what subjects are you signed up for";
        System.out.println(render);


        panel = scr.next();
        String semester;
        String subject;
        String login = "student";
        float grade;

        switch (panel)
        {
            case("1"):
                panel = "1";
                break;

            case("10"):
                System.out.println("provide semester to sign up for");
                semester=scr.next();
                System.out.println("provide subject to sign up for");
                subject = scr.next();
                logic.signUpForSubject(semester,subject);
                panel="8";
                break;

            case("11"):
                logic.getUniqueSubjectSemesters();
                System.out.println("test");
                panel="8";
                break;

        }

        return Integer.valueOf(panel);
    }


}
