package org.example.generics;

public class Pair<T, E> {
    T first;
    E second;

    public Pair(T first, E second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public E getSecond() {
        return second;
    }

    public void setSecond(E second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>("Hallo", 42);
        System.out.println(pair);
        pair.setFirst("abc");
        System.out.println(pair);
        pair.setSecond(123);
        System.out.println(pair);
        String s = pair.getFirst();
        Integer i = pair.getSecond();
    }
}
