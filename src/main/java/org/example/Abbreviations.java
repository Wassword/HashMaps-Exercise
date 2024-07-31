package org.example;
import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviationsMap;

    //Constructor
    public Abbreviations() {
        this.abbreviationsMap = new HashMap<>();
    }

    // Method to add new abbreviations and its explanation
    public void addAbbreviation(String abbreviation, String explanation ) {
        this.abbreviationsMap.put(abbreviation, explanation);
    }
    //Method  checks if an abbreviation has already been added
    public boolean hasAbbreviation(String abbreviation) {
        return abbreviationsMap.containsKey(abbreviation);
    }

    //Method finds the explanation for an abbreviation
    public String findExplanationFor(String abbreviation) {
        return abbreviationsMap.getOrDefault(abbreviation, null);
    }

    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");


        String text = "e.g. i.e. etc. lol";
        for (String part: text.split(" ")) {
            if(abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();


    }


}
