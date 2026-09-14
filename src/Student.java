//public class Student {
//    String name;
//    String firstname;
//    String lastname;
//
//    // First constructor: takes 3 params, chains to second constructor via firstname
//    public Student(String name, String firstname, String lastname) {
//        this(firstname);              // must be the first line - calls second constructor
//        this.firstname = firstname;   // initialize firstname
//        this.lastname = lastname;     // initialize lastname
//
//        System.out.println("First constructor called:");
//        System.out.println("Name: " + this.name);
//        System.out.println("Firstname: " + this.firstname);
//        System.out.println("Lastname: " + this.lastname);
//    }
//
//    // Second constructor: takes firstname, sets name
//    public Student(String firstname) {
//        this.name = firstname;
//        System.out.println("Second constructor called with firstname: " + firstname);
//    }
//
//    public static void main(String[] args) {
//        Student s1 = new Student("Ishimwe", "John", "Doe");
//    }
//}

    class Animal{
        void eat() {
            System.out.println("This animal eats food");
        }
    }
    class Dog extends Animal {
        void eat(){
            System.out.println("A dog eats bones");
        }
        void bark() {
            System.out.println("The dog says: Woof! Woof!");
        }
    }

    public class Student{
    public static void main( String[] args){
        Dog pet = new Dog();
        pet.eat();

        Dog puppy = (Dog) pet;
        puppy.bark();
    }
    }



