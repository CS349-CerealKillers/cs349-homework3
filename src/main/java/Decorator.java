/**
 * Created by Benjamin Daschel on 4/13/15.
 */
public interface Decorator<T> {

    /**
     *
     * @return the object which this is decorating
     */
    public T getDecorated();

    /**
     *
     * @param decorated object to be decorated
     * @return the decorated object
     */
    public T decorate(T decorated);
}
