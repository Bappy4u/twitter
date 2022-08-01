package com.bappy4u;

import java.util.ArrayList;

public class User {
    public String name;
    private ArrayList<Tweet> tweetArrayList = new ArrayList<>();
    public User(String name){
        this.name = name;

        System.out.println("User is created.");
    }

    public void createTweet(String tweet){
        Tweet tweets = new Tweet(tweet);
        this.tweetArrayList.add(tweets);
    }
    public void tweets(){
        for (Tweet tweet: this.tweetArrayList){
            System.out.println(tweet.getTweet());
        }
    }

}
