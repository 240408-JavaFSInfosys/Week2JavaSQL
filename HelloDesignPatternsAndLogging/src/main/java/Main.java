import factory.Cookie;
import factory.CookieFactory;
import singleton.Singleton;

public class Main {

    public static void main(String[] args) {

        System.out.println("======================================(Singleton)");

        //try to make 3 different instances of our Singleton Class
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        //print out the singletonMessage from each instance
        System.out.println("x: " + x.singletonMessage);
        System.out.println("y: " + y.singletonMessage);
        System.out.println("z: " + z.singletonMessage);

        //change the singletonMessage in Singleton x
        x.singletonMessage = x.singletonMessage.toUpperCase();

        //print out the same print statements from before
        System.out.println("x: " + x.singletonMessage);
        System.out.println("y: " + y.singletonMessage);
        System.out.println("z: " + z.singletonMessage);

        //print out the memory addresses of each singleton - it's the same object!!!
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        System.out.println("======================================(Factory)");

        //Instantiate a new CookieFactory
        CookieFactory cf = new CookieFactory();

        //Use the CookieFactory to make one of each cookie
        Cookie cookie1 = cf.getCookie("Chocolate Chip");
        Cookie cookie2 = cf.getCookie("Oatmeal Raisin");
        Cookie cookie3 = cf.getCookie("Ginger Snap");

        //Bake each cookie
        cookie1.bake();
        cookie2.bake();
        cookie3.bake();

        //The power of abstraction!! (And the Factory Design pattern)
        //We hid the long, bloated Cookie-making functionality within a Factory
        //So we just need to call methods to make cookies

    }

}
