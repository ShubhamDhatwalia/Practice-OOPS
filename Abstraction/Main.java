package Abstraction;

public class Main {
    public static void main(String[] args){
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(5,5);

        System.out.println(c.calculateArea());
        System.out.println(r.calculateArea());
    }
}

abstract class Shape{
    abstract int calculateArea();
}

class Circle extends Shape{
    
    private int radius;
    Circle(int radius){
        this.radius = radius;
    }

    int calculateArea(){
        return radius*radius;
    }

}

class Rectangle extends Shape{
    private int length;
    private int breadth;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    int calculateArea(){
        return length*breadth;
    }
}
