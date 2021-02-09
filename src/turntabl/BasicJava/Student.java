package turntabl.BasicJava;


import turntabl.AbstractsTypes.Nameable;
import turntabl.Enums.Level;

import java.util.List;

public class Student implements Nameable {

    protected List<Double> studentGrades;
    private final String studentName;
    public final Level studentLevel;

    public Student(List<Double> studentGrades, String name,Level level) {
        this.studentGrades = studentGrades;
        studentName=name;
        studentLevel=level;
    }

    public double getAverageGrade() {
        double total = 0;
        for(double grade:studentGrades){
            total += grade;
        }
        return (total/studentGrades.size());

    }

    @Override
    public String getName() {
        return studentName;
    }
}