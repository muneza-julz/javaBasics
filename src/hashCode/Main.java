package hashCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(103, "Alice", "Johnson", 88.5));
        students.add(new Student(101, "Bob", "Smith", 92.3));
        students.add(new Student(102, "Carol", "Davis", 75.0));
        students.add(new Student(104, "David", "Brown", 92.3));

        // Sort by id using Comparable
        Collections.sort(students);
        System.out.println("Sorted by id (Comparable):");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort by grade, descending, using Comparator
        Collections.sort(students, new GradeComparator());
        System.out.println("\nSorted by grade, descending (Comparator):");
        for (Student s : students) {
            System.out.println(s);
        }

        // Test equals() and hashCode(): same id and lastName
        Student a = new Student(101, "Bob", "Smith", 92.3);
        Student b = new Student(101, "Robert", "Smith", 50.0);
        System.out.println("\na.equals(b): " + a.equals(b));
        System.out.println("hashCodes equal: " + (a.hashCode() == b.hashCode()));
    }
}