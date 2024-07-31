package org.example;

import java.util.HashMap;

public class Nicknames {
    public static void main(String[] args) {
        HashMap<String,String> nicknames = new HashMap<>();

        // Store names and nicknames in the HashMap
        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");

        // Retrieve Matthew's nickname from the HashMap and prints it
        String matthewNickname = nicknames.get("matthew");
        System.out.println(matthewNickname);
    }

}
