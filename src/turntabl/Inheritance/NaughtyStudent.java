package turntabl.Inheritance;



import turntabl.BasicJava.Student;
import turntabl.Enums.Level;

import java.util.List;

public class NaughtyStudent extends Student {

    public NaughtyStudent(List<Double> studentGrades, String name, Level level) {
        super(studentGrades,name,level);
    }

    @Override
    public double getAverageGrade() {
        return super.getAverageGrade() + (super.getAverageGrade()* 0.1);
    }
}