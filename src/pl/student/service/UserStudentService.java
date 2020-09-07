package pl.student.service;

import pl.student.application.CurrentlyLogged;
import pl.student.model.Assignment;
import pl.student.model.Subject;
import pl.student.model.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class UserStudentService extends UserUniversityService {


    public UserStudentService(List<Subject> subject, List<Assignment> assignment, List<User> user) {
        super(subject, assignment, user);
    }

    public void signUpForSubject(String semester, String subject) {
        int tempSubjectId = 0;
        for (Subject singleSubject : this.subject) {
            if (singleSubject.getSemester().equals(semester) && singleSubject.getSubject().equals(subject)) {
                tempSubjectId = singleSubject.getsubjectsId();
                break;
            }
        }
        assignment.add(new Assignment(tempSubjectId, CurrentlyLogged.getLoggedUser()));
    }


    public void getStudentSignUps() {
        List<Integer> tempSubjectIdList = new ArrayList<>();
        boolean noExist = true;
        for (Assignment singleAssignment : this.assignment) {
            if (singleAssignment.getName().equals(CurrentlyLogged.getLoggedUser())) {
                tempSubjectIdList.add(singleAssignment.getSubjectId());
            }
        }
        for (Integer singleInteger : tempSubjectIdList) {
            for (Subject singleSubject : this.subject) {
                if (singleSubject.getsubjectsId() == singleInteger) {
                    System.out.println(singleSubject.getSemester() + " " + singleSubject.getSubject());
                    noExist = false;
                }
            }
        }

        if (noExist) {
            System.out.println("There are no subjects you are signed up for.\n");
        }
    }



}
