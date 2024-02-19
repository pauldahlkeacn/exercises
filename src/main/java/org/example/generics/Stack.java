package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private final List<T> elements;

    public Stack() {
        elements = new ArrayList<>();
    }

    public void push(T element) {
        elements.add(element);
    }

    public T peek() {
        if (elements.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return elements.getLast();
    }

    public T pop() {
        if (elements.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return elements.removeLast();
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();

    }
}
