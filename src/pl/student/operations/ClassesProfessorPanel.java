package pl.student.operations;


        import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class ClassesProfessorPanel {

    ClassesLogic logic;

    ClassesProfessorPanel(ClassesLogic logic)
    {
        this.logic = logic;

    }

    public int getPanel(List<Classes> dataSet) {


        String panel;
        Scanner scr = new Scanner(System.in);
        String render = "What do you wish to do. Type in number:\n 1 logout \n 4 to add new subject-semester pair "
                + "\n 5 to check existing subject-semester pairs \n 6 to add new grades to a student"
                + "\n 7 to check existing grades"
                + "\n 14 to check what students are sighed up for given semester - term pair";
        System.out.println(render);


        panel = scr.next();
        String semester;
        String subject;
        //String login = "professor";
        String name;
        float grade;

        switch (panel)
        {
            case("1"):
                panel = "1";
                break;

            case("4"):
                System.out.println("type in semester name");
                semester = scr.next();
                System.out.println("type in subject name");
                subject = scr.next();
                logic.addSubjectSemesters(semester, subject);
                panel="3";
                break;
            case("5"):
                logic.getUniqueSubjectSemesters();
                panel = "3";
                break;
            case("6"):
                System.out.println("type in semester");
                semester = scr.next();
                System.out.println("type in subject");
                subject = scr.next();
                System.out.println("type in student's name");
                name = scr.next();
                System.out.println("type in grade");
                grade = Float.valueOf(scr.next());
                logic.addNewGrade(semester,subject,name,grade);
                panel="4";
                break;

            case("7"):
                System.out.println("type in semester");
                semester = scr.next();
                System.out.println("type in subject");
                subject = scr.next();
                System.out.println("type in login name");
                name = scr.next();
                logic.showGrades(semester,subject,name);
                panel = "3";
                break;
            case("14"):
                System.out.println("type in semester");
                semester = scr.next();
                System.out.println("type in subject");
                subject = scr.next();
                logic.getSubjectSignUps(semester, subject);
                panel = "3";
                break;


        }

        return Integer.valueOf(panel);
    }



}

