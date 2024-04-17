//This custom Thread implements the Runnable Interface, and the run() method
public class InterfaceThread implements Runnable{

    @Override
    public void run() {

        //this method will run through a for loop and print a message
        //we're going to make some Threads race

        for(int i = 0; i < 10; i++){

            //This StringBuilder will be populated with the name of the current Thread we're in
            StringBuilder name = new StringBuilder(Thread.currentThread().getName());

            name.append(" is running...");

            //Print out the StringBuilder
            System.out.println(name);

            //Thread.sleep() forces a Thread to wait x amount of milliseconds between runs
            //this method potentially throws an exception, so we will need a try/catch
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace(); //print the error message
            }

        }

    }

}
