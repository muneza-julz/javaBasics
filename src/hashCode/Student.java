package hashCode;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private int id;
    private String firstName;
    private String lastName;
    private double grade;

    public Student(int id, String fname, String lname, double grade) {
        this.id = id;
        this.firstName = fname;
        this.lastName = lname;
        this.grade = grade;
    }

    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public double getGrade() { return grade; }

    @Override
    public String toString() {
        return "id: " + id + ", " + firstName + " " + lastName + ", grade: " + grade;
    }

    // Natural ordering: ascending by id
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    // Two students are equal if id and lastName match
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student other = (Student) o;
        return id == other.id && Objects.equals(lastName, other.lastName);
    }

    // Must use the same fields as equals()
    @Override
    public int hashCode() {
        return Objects.hash(id, lastName);
    }
}