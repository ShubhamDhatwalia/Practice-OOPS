package MultipleInheritence;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.draw();
        c.fill();
    }
}

interface Shape{
    void draw();
}
interface Color{
    void fill();
}

class Circle implements Shape, Color{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }

    public void draw(){
        System.out.println("Drawing a circle with radius " +radius);
    }
    public void fill(){
        System.out.println("Filling color in circle");
    }
}