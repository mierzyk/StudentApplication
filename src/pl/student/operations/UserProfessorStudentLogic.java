package pl.student.operations;


import pl.student.repository.Assignments;
import pl.student.repository.Subjects;
import pl.student.repository.Users;
import pl.student.repository.UserType;

import java.util.*;

public class UserProfessorStudentLogic {

    private List<Subjects> subjects;
    private List<Assignments> assignments;
    private List<Users> users;

    public UserProfessorStudentLogic(List<Subjects> repository, List<Assignments> assignments, List<Users> users) {
        this.subjects = repository;
        this.assignments = assignments;
        this.users = users;
    }

    public void addSubjectSemesters(String semester, String subject) {
        subjects.add(new Subjects(semester, subject));
        System.out.println("New semester subject pair has been added.");

    }

    public void getUniqueSubjectSemesters() {

        TreeSet<String> subjects = new TreeSet<>();

        for (Subjects singleSubject : this.subjects) {
            subjects.add(singleSubject.getSemester() + " " + singleSubject.getSubject());
        }

        Iterator<String> iter = subjects.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("\n");
    }

    public void getSubjectSignUps(String semester, String subject) {
        int tempSubjectId = 0;
        boolean noExist = true;

        for (Subjects singleSubject : this.subjects) {
            if (singleSubject.getSemester().equals(semester) && singleSubject.getSubject().equals(subject)) {
                tempSubjectId = singleSubject.getsubjectsId();
                break;
            }
        }

        for (Assignments singleAssignment : this.assignments) {
            if (singleAssignment.getSubjectId() == tempSubjectId) {
                System.out.println(singleAssignment.getName());
                noExist = false;
            }
        }
    if (noExist) {System.out.println("There are no subjects you are signed up for.");}


    }


    public void showGrades(String semester, String subject, String name) {
        int tempSubjectId = 0;
        boolean noExist = true;

        for (Subjects singleSubject : this.subjects) {
            if (singleSubject.getSemester().equals(semester) && singleSubject.getSubject().equals(subject)) {
                tempSubjectId = singleSubject.getsubjectsId();
                break;
            }
        }

        for (Assignments singleAssignment : this.assignments) {
            if (singleAssignment.getSubjectId() == tempSubjectId && singleAssignment.getName().equals(name)) {
                System.out.println(singleAssignment.getGrades());
                noExist = false;
                break;
            }
        }
        if (noExist) {System.out.println("There are no grades.\n");}

    }

    public void calculateAverageGrade(String semester, String subject, String name) {
        int tempSubjectId = 0;
        int tempGradesSum = 0;
        int counter = 0;
        boolean noGrades = true;
        boolean noExists = true;

        for (Subjects singleSubject : this.subjects) {
            if (singleSubject.getSemester().equals(semester) && singleSubject.getSubject().equals(subject)) {
                tempSubjectId = singleSubject.getsubjectsId();
                break;
            }
        }

        for (Assignments singleAssignment : this.assignments) {
            if (singleAssignment.getSubjectId() == tempSubjectId && singleAssignment.getName().equals(name)) {

                noExists = false;
                for (Float i : singleAssignment.getGrades()) {
                    tempGradesSum += i;
                    counter = counter + 1;
                    noGrades = false;
                }
                if (counter>0) {
                    System.out.println(tempGradesSum / counter);
                }

            }
        }
        if (noExists) {
            System.out.println("Such combination of semester - subject - student does not exist\n");
        }
        else if (noGrades) {System.out.println("There are no grades.\n");}
    }

    public void addNewGrade(String semester, String subject, String name, Float grade) {
        int tempSubjectId = 0;

        for (Subjects singleSubject : this.subjects) {
            if (singleSubject.getSemester().equals(semester) && singleSubject.getSubject().equals(subject)) {
                tempSubjectId = singleSubject.getsubjectsId();
                break;
            }
        }

        for (Assignments singleAssignment : this.assignments) {
            if (singleAssignment.getSubjectId() == tempSubjectId && singleAssignment.getName().equals(name)) {
                singleAssignment.setGrades(grade);
            }
        }
    }

    public boolean getUnexistingSemester(String semester) {
        boolean returner = true;

        for (Subjects singleSemester : this.subjects) {
            if (singleSemester.getSemester().equals(semester)) {
                returner = false;
                break;
            }
        }
        return returner;
    }


    public boolean getUnexistingSubject(String subject) {
        boolean returner = true;
        for (Subjects singleSubject : this.subjects) {
            if (singleSubject.getSubject().equals(subject)) {
                returner = false;
                break;
            }
        }
        return returner;
    }

    public boolean getUnexistingStudent(String name) {
        boolean returner = true;
        for (Users singleUsers : this.users) {
            if (singleUsers.getName().equals(name) && singleUsers.getAccessLevel().equals(UserType.STUDENT)) {
                returner = false;
                break;
            }
        }
        return returner;
    }

    public void signUpForSubject(String semester, String subject) {
        int tempSubjectId = 0;
        for (Subjects singleSubject : this.subjects) {
            if (singleSubject.getSemester().equals(semester) && singleSubject.getSubject().equals(subject)) {
                tempSubjectId = singleSubject.getsubjectsId();
                break;
            }
        }
        assignments.add(new Assignments(tempSubjectId, CurrentlyLogged.getLoggedUser()));
    }

    public void getStudentSignUps() {
        List<Integer> tempSubjectIdList = new ArrayList<>();
        boolean noExist = true;
        for (Assignments singleAssignment : this.assignments) {
            if (singleAssignment.getName().equals(CurrentlyLogged.getLoggedUser())) {
                tempSubjectIdList.add(singleAssignment.getSubjectId());
            }
        }
        for (Integer singleInteger : tempSubjectIdList) {
            for (Subjects singleSubject : this.subjects) {
                if (singleSubject.getsubjectsId() == singleInteger) {
                    System.out.println(singleSubject.getSemester() + " " + singleSubject.getSubject());
                    noExist=false;
                }
            }
        }

        if (noExist) {System.out.println("There are no subjects you are signed up for.\n");}
    }

}
