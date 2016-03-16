package ca.ualberta.cs.lonelytwitter;

/**
 * Created by jpeard on 3/8/16.
 */
public interface MyObservable {

    public void registerObserver(MyObserver o);

    public void myNotifyAll();
}
