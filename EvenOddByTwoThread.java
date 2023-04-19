import java.net.Socket;

public class EvenOddByTwoThread {
    int counter = 1;
    static int NUM;

    // METHOD FOR DISPLAYING THE ODD NUMBERS

    public void displayOddNumber(){
        synchronized (this){
            // print all the numbers till NUM;
            while (counter < NUM){
                while (counter % 2 == 0){
                    try {
                        wait();
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }
                }
                System.out.println(counter+" ");
                counter += 1;
                notify();
            }
        }
    }

    public void displayEvenNumber(){
        synchronized (this){
            while (counter < NUM){
                while (counter % 2 == 1){
                    try {
                        wait();
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                }
                System.out.println(counter+" ");
                counter += 1;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        NUM = 20;
        System.out.println(Runtime.getRuntime().availableProcessors());
        EvenOddByTwoThread oe = new EvenOddByTwoThread();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                oe.displayEvenNumber();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {

                oe.displayOddNumber();
            }
        });

        t1.start();
        t2.start();
    }
}
