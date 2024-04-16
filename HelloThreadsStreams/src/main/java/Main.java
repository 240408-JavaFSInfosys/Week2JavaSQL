public class Main {

    public static void main(String[] args) {

        System.out.println("=========================================(Threads)");

        //Instantiate two Threads
        InterfaceThread thread1 = new InterfaceThread();
        InterfaceThread thread2 = new InterfaceThread();

        //These don't actually create new instances of our Threads...
        //we need to use the start method for that - hence "main" is working
        thread1.run();
        thread2.run();

        //run thread1
        Thread t1 = new Thread(thread1);
        t1.start();

        //run thread2
        Thread t2 = new Thread(thread2);
        t2.start();

        //run thread3
        Thread t3 = new Thread(thread1);
        t3.start();

    }



}
