package Interface;
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c.calculateArea());
    }
}

interface Shape{
    public double calculateArea();
}

class Circle implements Shape{
    
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
}
