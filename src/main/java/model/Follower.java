package model;

import interfaces.Observer;

public class Follower implements Observer {
    private String followerName;

    public Follower(String followerName) {
        this.followerName = followerName;
    }

    public String getFollowerName() {
        return followerName;
    }

    public void setFollowerName(String followerName) {
        this.followerName = followerName;
    }

    @Override
    public void notifySubscribers(String message, String name) {
        System.out.println("Hi: " + this.followerName + " -> " + name+ " has made a post: " + message);
    }
}
