package turntabl.AbstractsTypes;

import turntabl.BasicJava.Student;
import turntabl.Enums.Level;
import turntabl.Enums.LevelSorter;

import java.util.ArrayList;
import java.util.List;

public class Register {
    public final List<Student> studentNames;

    public Register(List<Student> names){
        studentNames=names;
    }

    public List<String> getRegister(){
        List<String> temp=new ArrayList<>();
        for(Nameable nameable:studentNames){
            temp.add(nameable.getName());
        }
        return temp;
    }

    public List<String> getRegisterByLevel(Level level){
        List<String> temp=new ArrayList<>();
        Student checkStudent=null;
        for(Nameable nameable:studentNames){
            checkStudent=(Student)nameable;
            if(level == checkStudent.studentLevel){
                temp.add(checkStudent.getName());
            }
        }
        return temp;
    }

    public String printReport(Level level){
        studentNames.sort(new LevelSorter());
        StringBuilder stringBuilder=new StringBuilder();
        for(Student s:studentNames){
            stringBuilder.append(s.getName());
            stringBuilder.append("in level");
            stringBuilder.append(level);
            stringBuilder.append(" \n");
        }
        return stringBuilder.toString();
    }


}
