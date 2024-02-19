package org.example;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // countWords("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ac dui velit. Integer lectus neque, finibus pretium iaculis id, rhoncus sed arcu. Sed ante dui, sollicitudin non accumsan eget, viverra a eros. Proin lobortis nisl eu tempor tincidunt. Curabitur euismod, mi eget convallis fringilla, lorem mi mattis augue, ac blandit massa nunc quis felis. Nulla tristique ex sit amet convallis sodales. Pellentesque volutpat est ac imperdiet ultrices.");
        // readFile("VotingResults.txt");
        readInt();
    }

    public static void countWords(String text) {
        text = text.replaceAll("[-+.^:,]", "");
        Map<String, Integer> count = new HashMap<>();

        Arrays.stream(text.split(" "))
                .filter(w -> !w.isEmpty())
                .forEach(word -> count.put(word, count.getOrDefault(word, 0) + 1));

        System.out.println(count);
    }

    public static void readFile(String fileName) {
        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            String next;
            while ((next = in.readLine()) != null) {
                System.out.println(next);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The fileName " + fileName + " cannot be found");
        } catch (IOException e) {
            System.out.println("IO Excpetion occured\n");
            e.printStackTrace();
        }
    }

    public static void readInt() {
        System.out.println("Please enter a non negative number: ");
        boolean numberEntered = false;
        int number = -1;
        Scanner scanner = new Scanner(System.in);
        while (!numberEntered) {
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a number");
                scanner.nextLine();
                continue;
            }
            number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Please enter a non negative number");
                continue;
            }
            numberEntered = true;
        }
        System.out.println("Thank you for entering the number " + number);
    }


}