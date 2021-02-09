package turntabl.Enums;

import turntabl.BasicJava.Student;

import java.util.Comparator;

public class LevelSorter implements Comparator<Student> {
    @Override
    public int compare(Student one, Student two) {
        return one.studentLevel.compareTo(two.studentLevel);
    }
}
