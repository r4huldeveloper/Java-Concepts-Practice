public class Multithreading implements Runnable{

    public void run(){
        System.out.println("Now the thread is running");
    }
    public static void main(String[] args) {
        Runnable r1 = new Multithreading();
        Thread th = new Thread(r1,"My new thread");
        th.start();

        String str = th.getName();
        System.out.println(str);


        // Thread t = new Thread("My First thread");
        // t.start();

        // String str = t.getName();
        // System.out.println(str);
    }
    
}
