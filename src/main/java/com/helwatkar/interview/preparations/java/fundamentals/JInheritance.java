package com.helwatkar.interview.preparations.java.fundamentals;

public interface JInheritance {
    // Abstract method
    void display();

    // Default method
    default void show() {
        System.out.println("This is a default method in the interface.");
    }

    // Default method returning a value
    default String getMessage() {
        return "This is a default method returning a value.";
    }

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method in the interface.");
    }
}
