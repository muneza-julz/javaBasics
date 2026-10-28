package iostream;

import hashCode.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try(
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.bin"))
                ){
            oos.writeObject(new Student(12, "Angelo", "John", 7));
        }
    }
}
