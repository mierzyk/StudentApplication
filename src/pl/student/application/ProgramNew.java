package pl.student.application;
import pl.student.service.*;
import pl.student.model.Assignment;
import pl.student.model.Subject;
import pl.student.model.User;
import pl.student.repository.*;
import pl.student.ui.EntryPanel;
import pl.student.ui.UserAdminPanel;
import pl.student.ui.UserProfessorPanel;
import pl.student.ui.UserStudentPanel;

import java.util.List;


public class ProgramNew {
    public static void main(String[] args) {


        CrudRepository tempUserRepository = new UsersRepository();
        CrudRepository tempSubjectsRepository = new SubjectsRepository();
        CrudRepository tempAssignmentsRepository = new AssignmentsRepository();
        List<User> userDbImage = tempUserRepository.getAll();
        List<Subject> subjectDbImage = tempSubjectsRepository.getAll();
        List<Assignment> assignmentDbImage = tempAssignmentsRepository.getAll();


        EntryService entryService = new EntryService(userDbImage);
        EntryPanel entryPanel = new EntryPanel(entryService);
        UserAdminService userAdminService = new UserAdminService(userDbImage);
        UserAdminPanel userAdminPanel = new UserAdminPanel(userAdminService);

        UserProfessorService userProfessorService = new UserProfessorService(subjectDbImage, assignmentDbImage, userDbImage);
        UserStudentService userStudentService = new UserStudentService(subjectDbImage, assignmentDbImage, userDbImage);

        UserProfessorPanel userProfessorPanel = new UserProfessorPanel(userProfessorService);
        UserStudentPanel userStudentPanel = new UserStudentPanel(userStudentService);

        boolean loopStatus = true;
        int panel = 1;

        while (loopStatus) {

            switch (panel)

            {
                case 1: // logging
                    panel = entryPanel.getPanel();
                    break;

                case 2: // admin functions
                    panel = userAdminPanel.getPanel();
                    break;

                case 3: //professor functions
                    panel = userProfessorPanel.getPanel();
                    break;

                case 8: //student panel
                    panel = userStudentPanel.getPanel();
                    break;

                case 99:
                    loopStatus = false;
                    break;
            }
        }
    }
}
