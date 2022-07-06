package com.java_maps.example_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private final Map<Integer, Location> locations = new HashMap<>();
    private final Map<String, String> vocabulary = new HashMap<>();

    public Main() {
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
    }

    public void command() {
        Scanner scanner = new Scanner(System.in);

        vocabulary.put("north", "N");
        vocabulary.put("south", "S");
        vocabulary.put("east", "E");
        vocabulary.put("west", "W");
        vocabulary.put("quit", "Q");

        int location = 1;
        while(true) {
            System.out.println(locations.get(location).getDescription());
            if (location == 0)
                break;

            Map<String, Integer> exits = locations.get(location).getExits();
            for (String direction : exits.keySet())
                System.out.println(direction);

            String direction = scanner.nextLine().toLowerCase();
            if (direction.length() > 1) {
                String[] words = direction.split(" ");
                for (String word : words) {
                    if (vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }

            if (exits.containsKey(direction))
                location = exits.get(direction);
            else
                System.out.println("You cannot go in that direction");
        }
    }

}
