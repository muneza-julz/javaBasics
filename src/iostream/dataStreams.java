package iostream;

import java.io.*;

public class dataStreams {
    static void main() throws IOException {
        try (DataOutputStream out = new DataOutputStream(
                new FileOutputStream("data.bin"))) {
            out.writeInt(25);
            out.writeDouble(78.5);
            out.writeBoolean(true);
        }
        try (DataInputStream in = new DataInputStream(
                new FileInputStream("data.bin"))) {
            int age = in.readInt();
            double mark = in.readDouble();
            boolean passed = in.readBoolean();
            System.out.println("Age: " + age);
            System.out.println("Passed: " + passed);
        }

    }
}
