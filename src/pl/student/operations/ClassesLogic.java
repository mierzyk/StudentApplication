package pl.student.operations;


import pl.student.repository.Repository;

import java.util.*;

public class ClassesLogic {

    private List<Classes> repository;

    public ClassesLogic(List<Classes> repository) {
        this.repository = repository;
    }

    public void addSubjectSemesters(String semester,String subject) {
        repository.add(new Classes(semester, subject));
    }

    public void getUniqueSubjectSemesters() {

        TreeSet<String> subjects = new TreeSet<>();

        for(int i = 0; i<repository.size();i++)
        {
            subjects.add(repository.get(i).getSemester() + " " + repository.get(i).getSubject());
        }

        Iterator<String> iter = subjects.iterator();

        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }
/*
    public void addNewGrades(ArrayList<Classes> classes,String semester,String subject, String login, float grade)
    {
        for(int i = 0 ; i<classes.size(); i++) {

            if(classes.get(i).getSemester().equals(semester) && classes.get(i).getSubject().equals(subject)) )
            {
                classes.get(i).addGrades(grade);
            }
            else
            {

            }

        }

    }
*/
    public void showGrades(String semester,String subject, String name)
    {
        for(int i = 0 ; i<repository.size(); i++) {
            if(repository.get(i).getSemester().equals(semester) && repository.get(i).getSubject().equals(subject))
            {
                System.out.println(repository.get(i).getStudentsGrades(name));
            }
        }
    }

}

