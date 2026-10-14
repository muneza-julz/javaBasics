package hashCode;

import java.util.Comparator;

// sorts students in descending order by their grades
public class GradeComparator implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        return Double.compare(b.getGrade(), a.getGrade());
    }

}
