// File: MethodExamples.java
public class MethodExamples {
    // Method that prints a greeting
    public void printGreeting() {
        System.out.println("Hello, welcome to Java programming!");
    }

    // Method that takes a name and prints a personalized greeting
    public void printPersonalizedGreeting(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java programming!");
    }

    // Method that takes two integers and returns their sum
    public int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    // Overloaded methods to add numbers
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Main method to call other methods
    public static void main(String[] args) {
        MethodExamples example = new MethodExamples();

        // Calling method to print a greeting
        example.printGreeting();

        // Calling method to print a personalized greeting
        example.printPersonalizedGreeting("Alice");

        // Calling method to add numbers and print the result
        int sum = example.addNumbers(5, 10);
        System.out.println("The sum is: " + sum);

        // Calling overloaded add methods and print the results
        int intSum = example.add(3, 4);
        double doubleSum = example.add(2.5, 3.5);
        System.out.println("The integer sum is: " + intSum);
        System.out.println("The double sum is: " + doubleSum);
    }
}
