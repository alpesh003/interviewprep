package com.helwatkar.interview.preparations.java.fundamentals;

public class JAbstractClassI extends JAbstractClass{
    // Implementing the abstract method
    @Override
    public void display() {
        System.out.println("This is the implemented method in JAbstractClassI class.");
    }

    public static void main(String[] args) {
        JAbstractClass obj = new JAbstractClassI();
        obj.display(); // Calls the implemented method
        obj.show(); // Calls the concrete method from the abstract class
    }
}
