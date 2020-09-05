package pl.student.operations;


        import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class ClassesProfessor {

    ClassesLogic logic;

    ClassesProfessor(ClassesLogic logic)
    {
        this.logic = logic;

    }

    public int getPanel(ArrayList<Classes> dataSet) {


        String panel;
        Scanner scr = new Scanner(System.in);
        String render = "What do you wish to do. Type in number:\n 1 logout \n 5 to add new subject-semester pair "
                + "\n 6 to check existing subject-semester pairs \n 7 to add new grades to a student"
                + "\n 8 to check existing grades";
        System.out.println(render);


        panel = scr.next();
        String semester;
        String subject;
        String login = "professor";
        float grade;

        switch (panel)
        {
            case("1"):
                panel = "1";
                break;

            case("5"):
                System.out.println("type in semester name");
                semester = scr.next();
                System.out.println("type in subject name");
                subject = scr.next();
                logic.addSubjectSemesters(dataSet, semester, subject, login);
                panel="4";
                break;
            case("6"):
                logic.getUniqueSubjectSemesters(dataSet);
                break;
//            case("7"):
//                System.out.println("type in semester");
//                semester = scr.next();
//                System.out.println("type in subject");
//                subject = scr.next();
//                System.out.println("type in login name");
//                login = scr.next();
//                System.out.println("type in grade");
//                grade = Float.valueOf(scr.next());
//
//                logic.addNewGrades(dataSet,semester,subject,login,grade);
//                panel="4";
//                break;

            case("8"):
                System.out.println("type in semester");
                semester = scr.next();
                System.out.println("type in subject");
                subject = scr.next();
                System.out.println("type in login name");
                login = scr.next();

                logic.showGrades(dataSet,semester,subject,login);
                panel = "4";
                break;
        }

        return Integer.valueOf(panel);
    }



}

