package interfaces;

public interface Subject {

    public void addSubscriber(Observer observer);
    public void removeSubscriber(Observer observer);
    public void notifySubscriber(String message);
}
