package com.helwatkar.interview.preparations.java.fundamentals;

public class JPolymorphism implements JInheritance {
    // Method Overriding
    @Override
    public void display() {
        System.out.println("This is the overridden method in JPolymorphism class.");
    }

    // Method Overloading
    public void display(int number) {
        System.out.println("This is the overloaded method with an integer parameter: " + number);
    }

    public String overrideMethod() {
        return "This is the overridden method in JPolymorphism class.";
    }

    public static void main(String[] args) {
        JPolymorphism obj = new JPolymorphism();
        obj.display(); // Calls the overridden method
        obj.display(10); // Calls the overloaded method
        obj.show(); // Calls the default method from the interface
        JInheritance.staticMethod(); // Calls the static method from the interface
        obj.getMessage(); // Calls the default method returning a value
        obj.overrideMethod(); // Calls the overridden method with a return value
    }
}
