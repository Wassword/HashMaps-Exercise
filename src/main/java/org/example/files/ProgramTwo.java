package org.example.files;
import java.util.HashMap;
public class ProgramTwo {

    // Method to print all the values in the hashmap using the toString method of the Book objects
    public static void printValues(HashMap<String,Book> hashmap) {
        for (Book book : hashmap.values()) {
            System.out.println(book);
        }
    }
    // Method to print only the Books in the given hashmap which name contains the given string
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String bookName) {
        for (Book book : hashmap.values()) {
            if (book.getName().contains(bookName)) {
                System.out.println(book);
            }
        }

    }
    public static void main(String[] args) {
        HashMap<String,Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and Prejudice", 1813, "...."));

        //from example
        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
}
