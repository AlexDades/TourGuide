package com.example.adades.tourguideapp;

public class Location {

    //Declaring class variables
    private int lName;
    private int lImageResourceId;
    private int lLocation;

    //Creating the object constructor
    public Location (int name, int imageResourceId, int location){
        this.lImageResourceId = imageResourceId;
        this.lLocation = location;
        this.lName = name;
    }

    //Getter for the location name
    public int getlName(){
        return  lName;
    }

    //Getter for the location image
    public int getlImageResourceId(){
        return lImageResourceId;
    }

    //Getter for the address
    public int getlLocation(){
        return lLocation;
    }
}
