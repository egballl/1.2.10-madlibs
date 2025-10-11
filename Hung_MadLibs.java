/*
 * Hung_MadLibs2.java
 * Mad Libs program that accepts user input for nouns, verbs, and adjectives
 * and inserts them into a story template.
 */

import java.util.Scanner;

public class Hung_MadLibs{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Premade story
        String defaultS = "Hello, my name is <noun>. Today, I <verb> to the <adjective> store and bought a <adjective> <noun>. On the way home, I saw a <adjective> <noun> that was <verb> by the <noun>. Later, I <verb> with my <adjective> <noun> until the <noun> started to <verb>. It was the most <adjective> day ever!";
        /* Test Cases
        1. The <noun> <verb> across the <adjective> pond
        2. I went to the zoo to see a <noun>. There were people <verb> around the enclosure which made the <adjective> apes go bananas. */

        System.out.println("Choose an option:");
        System.out.println("1. Use premade story (15 words)");
        System.out.println("2. Enter your story");
        System.out.print("Enter your choice (1-2): ");
        int choice = input.nextInt();
        input.nextLine();
        
        String story = "";
        if (choice == 1) {
            story = defaultS;
        } else if (choice == 2) {
            System.out.println("Enter your test case below.");
            System.out.println("Use <noun>, <verb>, and <adjective> as placeholders.");
            System.out.println("Ex: The <adjective> <noun> <verb> quickly.\n");
            System.out.print("Enter Your Story: ");
            story = input.nextLine();
            if (story.indexOf("<") == -1) {
                System.out.println("Your story has no placeholders!");
            }
        } else {
            System.out.println("Invalid Input.");
            return;
        }
        
        int wordCount = 1;
        int startIndex = story.indexOf("<");
        while (startIndex != -1) {
            int endIndex = story.indexOf(">", startIndex);
            
            if (endIndex != -1) {
                String wordType = story.substring(startIndex + 1, endIndex);
                System.out.print("Enter a " + wordType + " (#" + wordCount + "): ");
                String userWord = input.nextLine();
                story = story.substring(0, startIndex) + userWord + story.substring(endIndex + 1);
                wordCount++;
                startIndex = story.indexOf("<");
            } else {
                break;
            }
        }
        
        System.out.println("\nYour Mad Lib: ");
        System.out.println(story);
    }
}
