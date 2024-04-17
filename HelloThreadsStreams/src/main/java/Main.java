import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        System.out.println("=========================================(Threads)");

        //Instantiate two Threads
        InterfaceThread thread1 = new InterfaceThread();
        InterfaceThread thread2 = new InterfaceThread();

        //These don't actually create new instances of our Threads...
        //we need to use the start method for that - hence "main" is working
        //thread1.run();
        //thread2.run();

        //run thread1
        Thread t1 = new Thread(thread1);
        t1.start();

        //run thread2
        Thread t2 = new Thread(thread2);
        t2.start();

        //run thread3
        Thread t3 = new Thread(thread1);
        t3.start();

        System.out.println("=========================================(Streams)");

        //Create a Stream of Integer objects
        IntStream.range(1,10).skip(3).forEach(x -> System.out.println(x));
        //The stream will have values of 1-9 (range - intermediate)
        //We skip the first 3 values (skip - intermediate)
        //FOR EACH value in the stream, print the value (forEach - terminal)

        //Stream.of() is a convenient method we can use to define whatever we want in a Stream
        //The data must be of the same type
        Stream.of("Okay", "Ummmm", "Ben", "Revature", "124123872319", "yep")
                .sorted() //this will sort the elements alphabetically
                .forEach(x -> {
                    String s = "The word we are on is: ";
                    System.out.println(s + x); //"The word we are on is: Okay" (for instance)
                });

        /* A more interesting use of Streams

            We'll make a Stream from an ArrayList, and make a new ArrayList holding the processed data
            which is probably more in line with what we would use Streams
         */

        //Create an ArrayList of Strings
        List<String> names = new ArrayList<String>(){{
            add("Ben");
            add("Jamie");
            add("Scooby Doo");
            add("The Hamburglar");
            add("Scooby Doo");
        }};

        //Now we'll use a Stream to process the data and save it into a new ArrayList
        List<String> processedNames = names.stream() //same as Stream.of(names)
                .distinct() //knocks out any duplicate values
                .sorted() //sort the values alphabetically
                .filter(element -> !element.startsWith("The")) //remove elements that start with "The"
                .toList(); //return the stream as an ArrayList (TERMINAL OPERATOR!)

        //print out the processed names
        System.out.println(processedNames);


        //one more stream just to show some more intermediate/terminal examples
        //This is also an example of Optionals in an Int context!
        OptionalInt reducedInt = IntStream.range(1, 11)
                .map(x -> x * x * x) //map lets us apply some function to each element (intermediate, unlike forEach)
                .reduce((x, y) -> x + y); //reduce will combine all the elements into one value (terminal)
                    //in this case, we're using reduce() to sum up all the cubed numbers

        System.out.println(reducedInt.getAsInt());

    } //end of main

}
