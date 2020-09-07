package pl.student.service;

import pl.student.model.Assignment;
import pl.student.model.Subject;
import pl.student.model.User;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class UserProfessorService extends UserUniversityService {


    public UserProfessorService(List<Subject> subject, List<Assignment> assignment, List<User> user) {
        super(subject, assignment, user);
    }

    public void addSubjectSemester(String semester, String subject) {
        super.subject.add(new Subject(semester, subject));
        System.out.println("New semester subject pair has been added.");

    }



    public void getSubjectSignUps(String semester, String subject) {
        int tempSubjectId = 0;
        boolean noExist = true;

        for (Subject singleSubject : this.subject) {
            if (singleSubject.getSemester().equals(semester) && singleSubject.getSubject().equals(subject)) {
                tempSubjectId = singleSubject.getsubjectsId();
                break;
            }
        }

        for (Assignment singleAssignment : this.assignment) {
            if (singleAssignment.getSubjectId() == tempSubjectId) {
                System.out.println(singleAssignment.getName());
                noExist = false;
            }
        }
        if (noExist) {
            System.out.println("There are students signed up for this semester-subject pair.\n");
        }


    }


    public void calculateAverageGrade(String semester, String subject, String name) {
        int tempSubjectId = 0;
        Float tempGradesSum = 0F;
        int counter = 0;
        boolean noGrades = true;
        boolean noExists = true;

        for (Subject singleSubject : this.subject) {
            if (singleSubject.getSemester().equals(semester) && singleSubject.getSubject().equals(subject)) {
                tempSubjectId = singleSubject.getsubjectsId();
                break;
            }
        }

        for (Assignment singleAssignment : this.assignment) {
            if (singleAssignment.getSubjectId() == tempSubjectId && singleAssignment.getName().equals(name)) {

                noExists = false;
                for (Float i : singleAssignment.getGrade()) {
                    tempGradesSum += i;
                    counter++;
                    noGrades = false;
                }
                if (counter > 0) {
                    System.out.println(tempGradesSum / counter);
                }
            }
        }
        if (noExists) {
            System.out.println("Such combination of semester - subject - student does not exist\n");
        } else if (noGrades) {
            System.out.println("There are no grades.\n");
        }
    }


    public void addNewGrade(String semester, String subject, String name, Float grade) {
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
                singleAssignment.setGrade(grade);
                noExist = false;
            }
        }
        if (noExist) {
            System.out.println("Such student is not signed up for this semester - subject pair");
        }
    }


}
