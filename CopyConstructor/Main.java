package CopyConstructor;
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(Student other) {
        this.name = other.name;
        this.age = other.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class Main{
    public static void main(String[] args) {
        Student s1 = new Student("Shubham", 22);

        Student s2 = new Student(s1);

        System.out.println(s1.getName());
        System.out.println(s2.getName());
    }
}
