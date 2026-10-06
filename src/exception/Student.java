package exception;

public class Student implements Comparable<Student>{

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "name: " + getName() + ", is " + getAge() + " years old!";
    }

    @Override
    public int compareTo(Student s2) {
        return Integer.compare(s2.getAge(), this.age);
    }



}
