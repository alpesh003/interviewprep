package com.helwatkar.interview.preparations.designpatterns.factorypattern;

public interface FactoryInterface {
    void factoryType();

    default String factoryDescription() {
        return "This is a default factory description.";
    }
}
