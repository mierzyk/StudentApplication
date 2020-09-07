package pl.student.operations;
import pl.student.service.EntryService;
import pl.student.service.UserAdminService;
import pl.student.service.UserProfessorStudentService;
import pl.student.model.Assignment;
import pl.student.model.Subject;
import pl.student.model.User;
import pl.student.repository.*;
import java.util.List;


public class ProgramNew {
    public static void main(String[] args) {


        CrudRepository tempUserRepository = new UsersRepository();
        CrudRepository tempSubjectsRepository = new SubjectsRepository();
        CrudRepository tempAssignmentsRepository = new AssignmentsRepository();
        List<User> userRepository = tempUserRepository.getAll(); //userDB costam
        List<Subject> subjectsRepository = tempSubjectsRepository.getAll();
        List<Assignment> assignmentRepository = tempAssignmentsRepository.getAll();

        EntryService entryLogic = new EntryService(userRepository);
        EntryPanel entryPanel = new EntryPanel(entryLogic);
        UserAdminService userAdminLogic = new UserAdminService(userRepository);
        UserAdminPanel userAdminPanel = new UserAdminPanel(userAdminLogic);
        UserProfessorStudentService userProfessorStudentLogic = new UserProfessorStudentService(subjectsRepository, assignmentRepository, userRepository);
        UserProfessorPanel userProfessorPanel = new UserProfessorPanel(userProfessorStudentLogic);
        UserStudentPanel userStudentPanel = new UserStudentPanel(userProfessorStudentLogic);



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
