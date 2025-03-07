package interfaces;

public interface Subject {

    public void addSubscriber(User user);
    public void removeSubscriber(User user);
    public void notifySubscriber(String message);
}
