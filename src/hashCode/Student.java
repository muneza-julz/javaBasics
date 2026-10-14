package hashCode;

// class Student, has natural sorting algorithm in ascending order
public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private int id;
    private double grade;

    public Student(String fname, String lname, int id, double grade){
        this.firstName = fname;
        this.lastName = lname;
        this.id = id;
        this.grade = grade;
    }
    public double getGrade(){ return grade;}

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getId() {return id;}
    @Override
    public String toString(){ return "name: " + (firstName+lastName) + ", grade: " + grade;}


    @Override
    public int compareTo(Student s2) {
        return Integer.compare( this.id, s2.getId());
    }


}
