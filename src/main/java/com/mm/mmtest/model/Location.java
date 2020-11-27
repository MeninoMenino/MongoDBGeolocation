package com.mm.mmtest.model;

public class Location {

    private String type;
    // [0] = longitude, [1] = latitude
    private Double[] coordinates;

    public Location(String type, Double[] coordinates){
        setType(type);
        setCoordinates(coordinates);
    }

    //Getters and Setters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Double[] coordinates) {
        this.coordinates = coordinates;
    }
}
