package SingleInheritence;

class Animal{
    void eat(){
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
public class SingleInheritence{
    public static void main(String[] args){
        Dog d  = new Dog();
        d.eat();
        d.sound();
    }
    
}