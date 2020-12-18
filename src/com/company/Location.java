package com.company;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String desciption;
    private final Map<String, Integer> exits;

    public Location(int locationID, String desciption) {
        this.locationID = locationID;
        this.desciption = desciption;
        this.exits = new HashMap<String, Integer>();
    }

    public void addExit(String direction, int location){
        exits.put(direction, location);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDesciption() {
        return desciption;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
