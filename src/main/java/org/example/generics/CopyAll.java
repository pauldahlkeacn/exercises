package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class CopyAll {

    public static void copyAll(List<? extends Number> source, List<? super Number> target) {
        target.addAll(source);
    }

    public static void main(String[] args) {
        List<Integer> source = List.of(1,2,3,4,5,6,7,8);
        List<Object> target = new ArrayList<>();

        copyAll(source, target);
        System.out.println(source);
        System.out.println(target);
    }
}
