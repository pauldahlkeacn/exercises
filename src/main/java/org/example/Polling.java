package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Polling {

    private final Scanner scanner;
    private final Map<String, Integer> results;


    public Polling(Scanner scanner, Map<String, Integer> results) {
        this.scanner = scanner;
        this.results = results;
    }

    void run() {
        while (scanner.hasNextLine()) {
            String text = scanner.nextLine();
            if (!text.isEmpty()) {
                String[] input = text.split(" ");
                String name = input[0].trim();
                int votes = Integer.parseInt(input[1].trim());
                results.put(name, results.getOrDefault(name, 0) + votes);
            }
        }

        System.out.println(results.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry<String, Integer>::getValue).reversed())
                .toList());
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner1 = new Scanner(new File("VotingResults.txt"));
        Polling polling = new Polling(scanner1, new HashMap<>());


        polling.run();
    }

}
