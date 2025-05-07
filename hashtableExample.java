import java.util.Hashtable;
import java.util.Scanner;

public class hashtableExample {
    public static void main(String[] args) {
        // Create a Hashtable that maps words (keys) to their meanings (values)
        Hashtable<String, String> table = new Hashtable<>();

        // Adding key-value pairs (word and meaning) to the Hashtable
        table.put("word1", "meaning1");
        table.put("word2", "meaning2");
        table.put("word3", "meaning3");

        // Print the entire Hashtable
        System.out.println(table);

        // Check if a specific value exists in the Hashtable
        System.out.println(table.containsValue("meaning5"));  // false

        // Check if a specific key exists in the Hashtable
        System.out.println(table.containsKey("word5"));  // false

        // Prompt the user to enter a word to search
        System.out.println("Enter the word you want to search");

        // Create a Scanner object to take input from the user
        Scanner sd = new Scanner(System.in);
        String search = sd.nextLine();  // Read user input

        // Retrieve the meaning of the word from the Hashtable
        String result = table.get(search);

        // Display the result (meaning of the entered word)
        System.out.println("Meaning of the word " + search + " is " + result);
    }
}
