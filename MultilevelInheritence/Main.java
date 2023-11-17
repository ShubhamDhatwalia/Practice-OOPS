package MultilevelInheritence;

public class Main {
    public static void main(String[] args){
        GermanShepherd g = new GermanShepherd();
        g.eat();
        g.sound();
        g.guard();
    }
}
class Animal{
    void eat(){
        System.out.println("Animal eats");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class GermanShepherd extends Dog{
    void guard(){
        System.out.println("German shepherd guards");
    }
}
