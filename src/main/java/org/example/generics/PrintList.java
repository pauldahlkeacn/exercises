package org.example.generics;

import java.util.List;
import java.util.stream.Collectors;

public class PrintList {

    public static void printList(List<?> list) {
        System.out.println(list.stream()
                .map(Object::toString)
                .collect(Collectors.joining(",", "[", "]")));

    }

    public static void main(String[] args) {
        printList(List.of(1,2,3,4,5,6));
    }
}
