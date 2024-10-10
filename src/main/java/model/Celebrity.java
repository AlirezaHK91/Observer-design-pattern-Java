package model;

import interfaces.Observer;
import interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class Celebrity implements Subject {
    private String celebrityName;
    private List<Observer> observerList = new ArrayList<>();

    public Celebrity(String celebrityName) {
        this.celebrityName = celebrityName;
    }

    @Override
    public void addSubscriber(User user) {
        observerList.add(user);
    }

    @Override
    public void removeSubscriber(User user) {
        observerList.remove(user);
    }

    @Override
    public void notifySubscriber(String message) {
        observerList.forEach(observer -> observer.notifySubscribers(message, this.celebrityName));
    }
}
