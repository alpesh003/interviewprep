package com.helwatkar.interview.preparations.java.fundamentals;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@RequiredArgsConstructor
public class JEncapsulation {
    // Private fields not allowing objects of this class to directly access name and age and
    // instead use getter and setter methods to access and modify them
    private String name;
    private int age;

    public JEncapsulation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        JEncapsulation obj = new JEncapsulation("John Doe", 30);
        obj.display();
    }
}
