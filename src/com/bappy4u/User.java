package com.bappy4u;

public class User {
    public String name;
    public User(String name){
        this.name = name;

        System.out.println("User is created.");
    }

    public void createTweet(String tweet){
        Tweet created = new Tweet(tweet);

    }
}
