import java.util.Scanner;

public class Hung_MadLibs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Premade story template (15 words)
        String defaultStory = "Hello, my name is <noun>. Today, I <verb> to the <adjective> store and bought a <adjective> <noun>. On the way home, I saw a <adjective> <noun> that was <verb> by the <noun>. Later, I <verb> with my <adjective> <noun> until the <noun> started to <verb>. It was the most <adjective> day ever!";
        System.out.println("Mad Libs 9,000,000!");
        System.out.println("Choose an option:");
        System.out.println("1. Use premade adventure story (15 words)");
        System.out.println("2. Enter your own custom story");
        System.out.print("Enter your choice (1-2): ");
        int choice = input.nextInt();
        input.nextLine();
        
        String selectedStory = "";

        if (choice == 1) {
            selectedStory = defaultStory;
        } else if (choice == 2) {
            // Allow user to enter their own test case
            System.out.println("Enter your test case below.");
            System.out.println("Use <noun>, <verb>, and <adjective> as placeholders.");
            System.out.println("Ex: The <adjective> <noun> <verb> quickly.\n");
            System.out.print("Your Story: ");
            selectedStory = input.nextLine();
            // verify that the story has at least one placeholder
            if (!selectedStory.contains("<")) {
                System.out.println("Your story has no placeholders! Adding a default one...");
                selectedStory += " The <adjective> end!";
            }
        } else {
            System.out.println("Invalid. Using premade adventure story.");
            selectedStory = defaultStory;
        }
        
        // the story according to user
        String completedStory = generateStory(selectedStory, input);
        System.out.println("\nYour Mad Libs Story: ");
        System.out.println(completedStory);
        
    }
    
    public static String generateStory(String story, Scanner input) {
        String result = story;
        int wordCount = 1;
        
        // Loop until all placeholders are replaced
        while (result.contains("<")) {
            // Find the next placeholder
            int startIndex = result.indexOf("<");
            int endIndex = result.indexOf(">", startIndex);
            if (startIndex != -1 && endIndex != -1) {
                // the word type (noun, verb, adjective)
                String wordType = result.substring(startIndex + 1, endIndex);
                // Prompt user for input
                System.out.print("Enter a " + wordType + " (#" + wordCount + "): ");
                String userWord = input.nextLine();
                // Replace the first occurrence of the placeholder
                String placeholder = "<" + wordType + ">";
                //result = result.replaceFirst(placeholder, userWord);   - change this later
                wordCount++;
            } else {
                break; // No more placeholders
            }
        }
        
        return result;
    }
}
