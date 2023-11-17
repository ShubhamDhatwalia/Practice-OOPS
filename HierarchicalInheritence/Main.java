package HierarchicalInheritence;

public class Main {
    
    public static void main(String[]args){
        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();
        d.sound();
        c.eat();
        c.sound();

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
class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}
