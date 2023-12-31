package com;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Word_counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'T' to enter text or 'F' to provide a file: ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("T")) {
            System.out.println("Enter the text: ");
            String input = scanner.nextLine();
            countWords(input);
        } else if (choice.equalsIgnoreCase("F")) {
            System.out.println("Enter the file path: ");
            String filePath = scanner.nextLine();
            try {
                String fileContent = readFile(filePath);
                countWords(fileContent);
            } catch (FileNotFoundException e) {
                System.out.println("File not found!");
            }
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
 
    public static void countWords(String input) 
 
    {
        String[] words = input.split("[\\s.,;?!]+");

            int wordCount = 0;

            Map<String, Integer> wordFrequency = new HashMap<>();

     
        for (String word : words) {
     
            wordCount++;

                 String[] stopWords = {"the", "a", "an", "and", "or", "but", "is", "are", "was", "were"};
            boolean isStopWord = false;
            for (String stopWord : stopWords) {
                if (word.equalsIgnoreCase(stopWord)) {
                    isStopWord = true;
                    break;
                }
            }
            if (isStopWord) {
                continue;
            }

            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        System.out.println("Total number of words: " + wordCount);
        System.out.println("Number of unique words: " + wordFrequency.size());
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) 
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static String readFile(String filePath) throws FileNotFoundException 
    {
        File file = new File(filePath);
        StringBuilder fileContent = new StringBuilder();
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            fileContent.append(scanner.nextLine()).append("\n");
        }
        scanner.close();
        return fileContent.toString();
    }
}