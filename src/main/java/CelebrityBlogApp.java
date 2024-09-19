import model.Celebrity;
import model.Follower;

public class CelebrityBlogApp {

    public static void main(String[] args) {
        Celebrity celebrity1 = new Celebrity("Johhny Depp");

        Follower follower1 = new Follower("Alireza");
        Follower follower2 = new Follower("Sayna");
        Follower follower3 = new Follower("Mahan");
        Follower follower4 = new Follower("Shiva");

        celebrity1.addSubscriber(follower1);
        celebrity1.addSubscriber(follower2);
        celebrity1.addSubscriber(follower3);
        celebrity1.addSubscriber(follower4);

        celebrity1.notifySubscriber("Have a good day guys.");
    }
}
