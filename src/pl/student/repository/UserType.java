package pl.student.repository;

public enum UserType {
    ADMIN, PROFESSOR, STUDENT;

    public String toString(){
        switch(this){
            case ADMIN :
                return "ADMIN";
            case PROFESSOR :
                return "PROFESSOR";
            case STUDENT :
                return "STUDENT";
        }
        return null;
    }


}
