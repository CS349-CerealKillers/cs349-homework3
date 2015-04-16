/**
 * Created by Benjamin Daschel on 4/15/15.
 */
public abstract class Decorator<T> {

    protected T decorated;

    public Decorator(T decorated){
        this.decorated = decorated;
    }
}
