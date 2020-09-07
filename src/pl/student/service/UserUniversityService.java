package pl.student.service;
import pl.student.model.Assignment;
import pl.student.model.Subject;
import pl.student.model.User;
import pl.student.model.UserType;

import java.util.*;

public class UserUniversityService {

    List<Subject> subject;
    List<Assignment> assignment;
    List<User> user;

    public UserUniversityService(List<Subject> subject, List<Assignment> assignment, List<User> user) {
        this.subject = subject;
        this.assignment = assignment;
        this.user = user;
    }


    public void showGrades(String semester, String subject, String name) {
        int tempSubjectId = 0;
        boolean noExist = true;

        for (Subject singleSubject : this.subject) {
            if (singleSubject.getSemester().equals(semester) && singleSubject.getSubject().equals(subject)) {
                tempSubjectId = singleSubject.getsubjectsId();
                break;
            }
        }

        for (Assignment singleAssignment : this.assignment) {
            if (singleAssignment.getSubjectId() == tempSubjectId && singleAssignment.getName().equals(name)) {
                System.out.println(singleAssignment.getGrade());
                noExist = false;
                break;
            }
        }
        if (noExist) {
            System.out.println("There are no grades.\n");
        }

    }


    public boolean getUnexistingSemester(String semester) {
        boolean returner = true;

        for (Subject singleSemester : this.subject) {
            if (singleSemester.getSemester().equals(semester)) {
                returner = false;
                break;
            }
        }
        return returner;
    }

    public boolean getUnexistingSubject(String subject) {
        boolean returner = true;
        for (Subject singleSubject : this.subject) {
            if (singleSubject.getSubject().equals(subject)) {
                returner = false;
                break;
            }
        }
        return returner;
    }

    public boolean getUnexistingStudent(String name) {
        boolean returner = true;
        for (User singleUser : this.user) {
            if (singleUser.getName().equals(name) && singleUser.getAccessLevel().equals(UserType.STUDENT)) {
                returner = false;
                break;
            }
        }
        return returner;
    }

    public void getUniqueSubjectSemesters() {

        TreeSet<String> subjects = new TreeSet<>();

        for (Subject singleSubject : this.subject) {
            subjects.add(singleSubject.getSemester() + " " + singleSubject.getSubject());
        }

        Iterator<String> iter = subjects.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("\n");
    }

}
