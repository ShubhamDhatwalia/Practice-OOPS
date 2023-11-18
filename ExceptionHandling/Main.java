// Exception handling is a programming mechanism that deals with runtime errors or exceptional situations that may occur during the execution of a program. These errors are typically beyond the control of the programmer and may disrupt the normal flow of a program. Java provides a robust system for exception handling with keywords such as try, catch, finally, throw, and throws.


// Try:

// The try block is used to enclose a section of code where an exception might occur. It is followed by one or more catch blocks and an optional finally block.

// Catch:

// The catch block is used to catch and handle exceptions thrown in the corresponding try block. Multiple catch blocks can be used to handle different types of exceptions.

// Finally:

// The finally block is optional and is used to specify code that must be executed, regardless of whether an exception occurred or not. It is often used for cleanup operations (e.g., closing resources).

// Throw:

// The throw keyword is used to explicitly throw an exception. You can throw a specific exception or create your own custom exception.

// Throws:

// The throws clause is used in a method signature to declare that a method may throw one or more types of exceptions. It informs the caller of the method about the exceptions it might need to handle.


package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6,7,8};

        System.out.println(arr[1]);
        try{
        System.out.println(arr[-1]);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
        System.out.println(arr[5]);
        }

        try{
            myException();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
    static void myException() throws Exception{
            throw new Exception("Something Went Wrong");
        }
}
