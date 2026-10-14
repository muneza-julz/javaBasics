package exception;

import java.util.Scanner;

public class AgeMain {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int age;
        age = c.nextInt();

        try {
            if (age < 18) {
                throw new AgeException("not allowed");
            }
        } catch (AgeException e) {
            System.out.println(e);
        }
    }
}
