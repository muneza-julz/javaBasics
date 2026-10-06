package exception;

public class Generic_wildcards {
    public static void main(String[] args) {
        int age = 14;
        String name = "JD";
        getValue(age);

    }

    public static<T> String getValue(T value) {
        return "The value is: " + value;
    }
}
