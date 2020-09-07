package pl.student.operations;
import pl.student.repository.Users;
import pl.student.repository.*;
import java.util.List;


public class ProgramNew {
    public static void main(String[] args) {


        CrudRepository tempUserRepository = new UsersRepository();
        CrudRepository tempSubjectsRepository = new SubjectsRepository();
        CrudRepository tempAssignmentsRepository = new AssignmentsRepository();
        List<Users> usersRepository = tempUserRepository.getAll();
        List<Subjects> subjectsRepository = tempSubjectsRepository.getAll();
        List<Assignments> assignmentRepository = tempAssignmentsRepository.getAll();

        EntryLogic entryLogic = new EntryLogic(usersRepository);
        EntryPanel entryPanel = new EntryPanel(entryLogic);
        UserAdminLogic userAdminLogic = new UserAdminLogic(usersRepository);
        UserAdminPanel userAdminPanel = new UserAdminPanel(userAdminLogic);
        UserProfessorStudentLogic userProfessorStudentLogic = new UserProfessorStudentLogic(subjectsRepository, assignmentRepository, usersRepository);
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
