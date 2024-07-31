package org.example;

import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> iouMap;

    // Constructor to create a new IOU
    public IOU() {
        this.iouMap = new HashMap<>();
    }

    // Method to save the amount owed and the person owed to the IOU
    public void setSum(String toWhom, double amount) {
        iouMap.put(toWhom, amount);
    }

    // Method to return the amount owed to the person whose name is given as a parameter
    public double howMuchDoIOweTo(String toWhom) {
        return iouMap.getOrDefault(toWhom, 0.0);
    }

    public static void main(String[] args) {
        // Example usage
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur")); // Prints: 51.5
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael")); // Prints: 30.0
        System.out.println(mattsIOU.howMuchDoIOweTo("John")); // Prints: 0.0
    }
}
