package com.java_maps.example_1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Location {

    private final int locationID;
    private final String description;

    private final Map<String, Integer> moveTo;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        moveTo = new LinkedHashMap<>();
        moveTo.put("quit", 0);
    }

    public String getDescription() {
        return description;
    }

    public int getLocationID() {
        return locationID;
    }

    public Map<String, Integer> getMoveTo() {
        return new LinkedHashMap<>(moveTo);
    }

    public void addMove(String direction, int locationID) {
        moveTo.put(direction, locationID);
    }

}
