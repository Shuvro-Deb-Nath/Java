import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo { // Class name should start with an uppercase letter
    public static void main(String[] args) {
        // Creating an ArrayList of integers
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(600);
        list1.add(200);
        list1.add(400);
        list1.add(100);

        // Printing all elements using enhanced for loop
        System.out.println("Print all objects:");
        for (int s : list1) {
            System.out.println(s);
        }

        // Sorting the list in ascending order
        Collections.sort(list1);
        System.out.println("Sorted list: " + list1);

        // Adding an element at index 1
        list1.add(1, 700);
        System.out.println("List after adding 700 at index 1: " + list1);

        // Accessing element at index 3
        System.out.println("Object at index 3 is: " + list1.get(3));

        // Getting the size of the list
        System.out.println("Size of the list: " + list1.size());

        // Removing the element at index 3
        list1.remove(3);
        System.out.println("List after removing element at index 3: " + list1);

        // Creating an ArrayList of strings
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("DA");
        list2.add("KAB");
        list2.add("BABC");
        list2.add("AABCD");

        // Printing the list of strings
        System.out.println("Original string list: " + list2);

        // Removing an element by value
        list2.remove("BABC");
        System.out.println("List after removing 'BABC': " + list2);

        // Sorting the string list alphabetically
        Collections.sort(list2);
        System.out.println("Alphabetically sorted list: " + list2);

        // Shuffling the elements in the list
        Collections.shuffle(list2);
        System.out.println("Shuffled list: " + list2);

        // Counting the frequency of "DA" in the list
        System.out.println("Frequency of 'DA': " + Collections.frequency(list2, "DA"));

        // Checking if "KAB" is present in the list
        System.out.println("Does the list contain 'KAB'? " + list2.contains("KAB"));
    }
}
