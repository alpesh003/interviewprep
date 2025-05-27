package com.helwatkar.interview.preparations.designpatterns.singletonpattern;

import org.springframework.stereotype.Component;

@Component
public class SingletonPattern {
    private static volatile SingletonPattern instance; // Volatile to indicate the latest state to all threads at memory level and not at thread cache level.

    private SingletonPattern() {
        // Private constructor to prevent instantiation
    }

    public static SingletonPattern getInstance() {
        if(instance == null) {
            synchronized (SingletonPattern.class) {
                if(instance == null) { // Double-checking to reduce synchronization overhead
                    instance = new SingletonPattern();
                }
            }
        }
        return instance;
    }
    public String getMessage() {
        String message = """
        This is a singleton pattern example! By default in Spring Boot, the bean is a singleton.
        Hence, we won't require explicit use of the Singleton pattern.
        
        However, if you want to implement it manually, you can use the above code.
        This is a thread-safe singleton implementation using double-checked locking.
        
        The instance is created only when it is needed, and the synchronized block ensures that only one thread can create the instance at a time.
        This approach is efficient and avoids unnecessary synchronization after the instance is created.
        """;
        return message;
    }
}
