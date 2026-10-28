package hashCode;

public class Dogg {
    private String name;
    private int age;

    public Dogg( String name, int age){
        this.name = name;
        this.age = age;
    }

    void sound(){
        System.out.println(name + " barks!");
    }

    // name, is age years old
    @Override
    public String toString(){
        return name + ", is " + age + " years old";
    }

    public void getAge(){
        System.out.println(age);
    }



}


