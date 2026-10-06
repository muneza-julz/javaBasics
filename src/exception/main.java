package exception;

import java.util.Collection;
import java.util.ArrayList;

enum GenderType {
    MALE, FEMALE, NONE
}




public class main {
    public static void main(String[] args) {
        Collection<Integer> c= new ArrayList<>();
        c.add(5);
//        c.add("Jane");
        c.add(4);

        for ( Integer num: c) {
            System.out.println(num);
        }

        Box<String> name = new Box<>("Jane");
        Box<Integer> age = new Box<>(5);
        Box<GenderType> gender = new Box<GenderType>(GenderType.FEMALE);
        Box<Boolean> adult = new Box<>(true);
    }

}

