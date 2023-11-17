package SuperKeyword;

public class Main {
    public static void main(String[]args){
        Dog d = new Dog();
        d.eat();
        d.displayColor();
        
    }
}

class Animals{
    String color = "Brown";

    void eat(){
        System.out.println("Animals are eating");
    }
}
class Dog extends Animals{
    
    Dog(){
        super.color = "White";
    }

    void displayColor(){
        System.out.println(color);
    }

}
