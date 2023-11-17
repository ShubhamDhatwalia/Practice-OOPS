package Encapsulation;

public class Main {
    public static void main(String [] args){
        Student s1 = new Student("YOUR NAME", 00);
        s1.setName("Shubham");
        System.out.println( s1.getName());
        System.out.println(s1.getAge());
    }
}

class Student{
    private String Name;
    private int age;

    Student(String Name, int age){
        this.Name = Name;
        this.age = age;
    }

    // methods to access these members
    String getName(){
        return Name;
    }
    int getAge(){
        return age;
    }

    // methods to modify these members values 
    void setName(String Name){
        this.Name = Name;
    }
    void setAge(int age){
        this.age = age;
    }
}