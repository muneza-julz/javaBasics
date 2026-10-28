package hashCode;

import java.util.Comparator;

public class GradeComparator implements Comparator<Student> {
    // Descending by grade: compare b to a not a to b
    @Override
    public int compare(Student a, Student b) {
        return Double.compare(b.getGrade(), a.getGrade());
    }
}