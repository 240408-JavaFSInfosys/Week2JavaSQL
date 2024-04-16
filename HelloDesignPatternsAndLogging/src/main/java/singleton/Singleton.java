package singleton;

//ctrl + shift + / to make a block comment

/*A Singleton is a Class that can only have one instance at a time
You can make multiple OBJECTS, sure, but they'll all be identical to each other

A big difference between Singletons and other Classes is...
To instantiate a normal Class, we use the constructor and the new keyword
To instantiate a Singleton, we use a getInstance() method */

public class Singleton {

    //private static variable of type Singleton (our Class)
    private static Singleton singleton;

    //String variable to help us demonstrate that there is only one instance of the Singleton
    public String singletonMessage;

    //static method to create a SINGLE instance of our Singleton Class
    public static Singleton getInstance(){
        if(singleton == null) { //if the singleton is null (doesn't exist yet)
            singleton = new Singleton(); //make a new singleton!
        }
        return singleton; //otherwise, return the singleton that already exists
    }

    //private constructor (so only the Singleton Class can see it)
    private Singleton () {
        singletonMessage = "I'm the only possible instance of this Singleton Class!";
        System.out.println("Hello from the constructor!"); //this should only print once!
    }

}
