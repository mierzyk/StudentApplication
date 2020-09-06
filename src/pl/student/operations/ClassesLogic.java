package pl.student.operations;


import java.util.*;

public class ClassesLogic {

    private List<Classes> repository;

    public ClassesLogic(List<Classes> repository) {
        this.repository = repository;
    }

    public void addSubjectSemesters(String semester, String subject) {
        repository.add(new Classes(semester, subject));
    }

    public void getUniqueSubjectSemesters() {

        TreeSet<String> subjects = new TreeSet<>();

        for (int i = 0; i < repository.size(); i++) {
            subjects.add(repository.get(i).getSemester() + " " + repository.get(i).getSubject());
        }

        Iterator<String> iter = subjects.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public void getUniqueSubjectSemesters(String name) {
        for (int i = 0; i < repository.size(); i++) {
            if (repository.get(i).getStudentName().equals(name)) {
                System.out.println(repository.get(i).getSemester() + " " + repository.get(i).getSubject());
            }
        }


    }

    public boolean getUnexistingSemester(String semester) {
        boolean returner = true;

        for (int i = 0; i < repository.size(); i++) {
            if (repository.get(i).getSemester().equals(semester)) {
                returner = false;
            }

        }
        return returner;
    }


    public boolean getUnexistingSubject(String subject) {
        boolean returner = true;

        for (int i = 0; i < repository.size(); i++) {
            if (repository.get(i).getSubject().equals(subject)) {
                returner = false;
            }

        }
        return returner;
    }


    public void getStudentSignUps(String name) {
        try {
            for (int i = 0; i < repository.size(); i++) {

                if (repository.get(i).getStudents().contains(name)) {
                    System.out.println(repository.get(i).getSemester() + " " + repository.get(i).getSubject());
                }
            }
        } catch (NullPointerException e) {
        }
    }

    public void getSubjectSignUps(String semester, String subject) {
        try {
            for (int i = 0; i < repository.size(); i++) {

                if (repository.get(i).getSemester().equals(semester) && repository.get(i).getSubject().equals(subject)) {
                    System.out.println(repository.get(i).getStudents());
                }
            }
        } catch (NullPointerException e) {
        }
    }


    public void signUpForSubject(String semester, String subject) {
        for (int i = 0; i < repository.size(); i++) {

            if (repository.get(i).getSemester().equals(semester) && repository.get(i).getSubject().equals(subject)) {
                System.out.println(CurrentlyLogged.getLoggedUser());
                repository.get(i).setSemesterSubjectStudent(CurrentlyLogged.getLoggedUser());
            }

        }


    }


    public void showGrades(String semester, String subject, String name) {
        for (int i = 0; i < repository.size(); i++) {
            if (repository.get(i).getSemester().equals(semester) && repository.get(i).getSubject().equals(subject)) {
                System.out.println(repository.get(i).getStudentsGrades(name));
            }
        }
    }

    public void addNewGrade(String semester, String subject, String name, Float grade) {
        System.out.println("test1");
        try {
            for (int i = 0; i < repository.size(); i++) {
                System.out.println("test2");
                if (repository.get(i).getSubject().equals(subject) && repository.get(i).getSemester().equals(semester)) {
                    System.out.println("test3");
                    repository.get(i).setStudentsGrade(name, grade);
                    System.out.println("test4");
                }

            }
        } catch (NullPointerException e) {
        }
        System.out.println("test5");
    }

}

