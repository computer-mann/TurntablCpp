package turntabl.Exceptions;

public class StudentNotFoundException extends Exception {

    public void printCustomMessage(){
        System.out.println("The student being queried can not be found.");
    }
}
