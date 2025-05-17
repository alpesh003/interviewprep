package com.helwatkar.interview.preparations.java.fundamentals.genericsjava;

import lombok.Data;

public class GenericBox<T> {
    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    private T item;
}
