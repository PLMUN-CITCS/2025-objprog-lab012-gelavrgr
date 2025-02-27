// File Naming Convention: MethodDemo.java

public class MethodDemo {
    public static void main(String[] args) {
        greet(); // Calling the greet method
        printMessage("This is my message!"); // Calling the printMessage method
    }

    // Method to greet the user
    public static void greet() {
        System.out.println("Hello from the greet method!");
    }

    // Method to print a message
    public static void printMessage(String message) {
        System.out.println(message);
    }
}
