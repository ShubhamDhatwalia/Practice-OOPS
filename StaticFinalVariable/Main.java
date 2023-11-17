package StaticFinalVariable;

public class Main {
    public static void main(String[]args){
        A a = new A();
       System.out.println(a.data); 
    }
}
class A{
    static final int data;                   // static blank variable
    static{data = 20;}                       // intialization of it
}
