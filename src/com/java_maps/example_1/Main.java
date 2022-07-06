package com.java_maps.example_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You are learning Java"));
        locations.put(1, new Location(1, "You are at the Center of FootBall Court"));
        locations.put(2, new Location(2, "You are at the North of FootBall Court"));
        locations.put(3, new Location(3, "You are at the South of FootBall Court"));
        locations.put(4, new Location(4, "You are at the West of FootBall Court"));
        locations.put(5, new Location(5, "You are at the East of FootBall Court"));

        locations.get(1).addMove("north", 2);
        locations.get(1).addMove("south", 3);
        locations.get(1).addMove("west", 4);
        locations.get(1).addMove("east", 5);

        locations.get(2).addMove("center", 1);
        locations.get(2).addMove("west", 4);
        locations.get(2).addMove("east", 5);

        locations.get(3).addMove("center", 1);
        locations.get(3).addMove("west", 4);
        locations.get(3).addMove("east", 5);

        locations.get(4).addMove("center", 1);
        locations.get(4).addMove("north", 2);
        locations.get(4).addMove("south", 3);

        locations.get(5).addMove("center", 1);
        locations.get(5).addMove("north", 2);
        locations.get(5).addMove("south", 3);

        int location = 1;
        while(true) {
            System.out.println("==========================================");
            System.out.println(locations.get(location).getDescription());
            System.out.println("==========================================");
            if(location == 0) {
                break;
            }

            Map<String, Integer> moveTo = locations.get(location).getMoveTo();
            System.out.println("You can quit or move to these locations in the FootBall Court:");
            for (String key : moveTo.keySet())
                System.out.println(key);

            System.out.println("Please enter you direction to move: ");
            String direction = scanner.nextLine().toLowerCase();
            if (moveTo.containsKey(direction))
                location = moveTo.get(direction);
            else
                System.out.println("You cannot move to that part of the FootBall Court");
        }

    }

}
