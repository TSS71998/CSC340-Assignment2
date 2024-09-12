package com.csc340.assignment2;

public class Game {
    public String name;
    public String releaseDate;
    public String developer;


    public Game(String name, String releaseDate, String developer) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.developer = developer;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String date) {
        this.releaseDate = releaseDate;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String type) {
        this.developer = developer;
    }





}
