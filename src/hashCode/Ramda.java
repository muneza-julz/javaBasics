package hashCode;

public class Ramda {
    public static void main(String[] args){
        K k=(int a, int b) -> System.out.println("in display: " + (a + b));
        k.display(9,7);

        K q = new K() {

            @Override
            public void display(int a, int b) {
                System.out.println("Sum: " + (a+b));
            }
        };
        q.display(5, 10);

    }

}
