package com.bappy4u;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the tweeter!");

        System.out.println("you can use this tweeter just only put your name.");
        System.out.print("If you want to use tweet type 'yes':");

        Scanner sc = new Scanner(System.in);
        String yes = sc.nextLine();
        yes = yes.toLowerCase();
        while (!yes.equals("yes")){
            System.out.println("Type error! Please Enter 'yes' to continue.");
            yes = sc.nextLine();
            yes = yes.toLowerCase();
        }
        System.out.print("Please enter your name:");
        User user = new User(sc.nextLine());

        System.out.println("Hi "+user.name+ ", Thanks for the joining!");

        System.out.print("If you want to post a tweet enter 1 or if you want to see your tweet enter 'tweets':");
        String userIn = sc.nextLine();
        userIn = userIn.toLowerCase();

        while (!(userIn.equals("1") || userIn.equals("tweets"))){
            System.out.println("Type error! Please Enter '1' or 'tweets' to continue.");
            userIn = sc.nextLine();
            userIn= userIn.toLowerCase();
        }
        if (userIn.equals("1")){
            user.createTweet(sc.nextLine());
        }
        else{
            System.out.println(user.name + ", this is all your tweets:");
            user.tweets();
        }



    }
}
