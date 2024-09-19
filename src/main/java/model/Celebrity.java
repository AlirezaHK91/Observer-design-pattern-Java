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
    public void addSubscriber(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscriber(String message) {
        observerList.forEach(observer -> observer.notifySubscribers(message, this.celebrityName));
    }
}
