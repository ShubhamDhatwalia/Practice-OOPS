package MethodOverLoading;
class MathOperations{

    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }
}
class Main{
    public static void main(String[]args){
        MathOperations math = new MathOperations();
        System.out.println(math.add(5, 5));                // calls the int version
        System.out.println(math.add(5.0, 5.0));            // calls the double version
    }
}