package pl.student.operations;

import pl.student.Credentials;
import pl.student.repository.Repository;

import java.util.List;

public class CredentialsLogic {


    private List<Credentials> repository;

    public CredentialsLogic(List<Credentials> repository) {
        this.repository = repository;
    }


    public boolean verifyCredentials(List<Credentials> dataSet, String login, String password) {


        boolean returnValue = false;
        for (int i = 0; i < dataSet.size(); i++) {
            if (dataSet.get(i).getLogin().contentEquals(login) && dataSet.get(i).getPassword().contentEquals(password)) {
                returnValue = true;
                break;

            }
        }
        return returnValue;
    }


    public void getCredentials(List<Credentials> dataSet) {
        System.out.println("type - login - password");
        for(int i =0; i<dataSet.size(); i++)
            System.out.println(dataSet.get(i).getType() + "-" + dataSet.get(i).getLogin() + "-" + dataSet.get(i).getPassword());
        System.out.println("\n");
    }

    public String returnTypeForLogin(List<Credentials> dataSet, String login) {
        String returnValue = "";
        for (int i = 0; i < dataSet.size(); i++) {
            if (dataSet.get(i).getLogin().contentEquals(login)) {
                returnValue = dataSet.get(i).getType();
                break;
            }
        }
        return returnValue;
    }


    public void addNewAccount(List<Credentials> dataSet, String type, String login, String password) {
        dataSet.add(new Credentials(type, login, password));
    }


    public boolean checkAccountExistance(List<Credentials> dataSet, String login) {

        boolean existance = false;

        for (int i = 0; i < dataSet.size(); i++) {
            if (dataSet.get(i).getLogin().contentEquals(login)) {
                existance = true;
                break;
            }
        }
        return existance;
    }

}
