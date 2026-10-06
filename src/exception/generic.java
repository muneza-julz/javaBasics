package exception;


import java.util.*;

public class generic {
    public static void main(String[] args){

        // Sorting algorithm with comparators
//        Comparator<Student> com = new Comparator<Student>(){
//            @Override
//            public int compare ( Student s1, Student s2) {
//
//                int age1 = s1.getAge();
//                int age2 = s2.getAge();
//
//                if (age1 > age2)
//                    return 1;
//                else if (age1 == age2)
//                    return 0;
//                else return -1;
//            }
//        };



        List<Student> list = new ArrayList<>();
        list.add(new Student("Alice", 20));
        list.add(new Student("John", 6));
        list.add(new Student("Charles", 12));

        Collections.sort(list);
        Iterator<Student> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }


    public static void Display (List<?> list){
        for(Object item: list){
            System.out.println(item);
        }
    }
}
