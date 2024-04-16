package factory;

//All objects that implement Cookie will have access to its method
//We'll use the CookieFactory Class to write logic that creates Cookie-type object

public interface Cookie {

    //All implementing classes will have their own version of this method!
    public void bake();

}
