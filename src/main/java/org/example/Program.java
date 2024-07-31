package org.example;
import java.util.HashMap;


public class Program {
    public static void printKeys(HashMap<String,String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key + " : " + hashmap.get(key));
        }
    }
        // Method to print keys containing the specified text
        public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key + " : " + hashmap.get(key));
            }
        }

    }
    // Method to print values of keys containing the specified text
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key + " : " + hashmap.get(key));
            }
        }

    }
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }


}
