package com.bappy4u;

public class Tweet {
    private String date;
    private String tweet;
    public User user;
    public Tweet(String tweet)
    {
        if (tweet.length()<120){
            this.tweet = tweet;
        }
        else{
            System.out.println("you can not tweet a text over 120 characters");
        }
        System.out.println("Tweet is created.");

    }
    public void setTweet(String tweet){


    }
    public String getTweet(){
        return this.tweet;
    }


}
