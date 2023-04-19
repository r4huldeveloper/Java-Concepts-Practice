public class Demo extends Thread {
    static Thread t1;
    // custom thread
//    public void run() {
//        for(int i=1; i<=5; i++){
//            try{
//                Thread.sleep(5000);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//            System.out.println(i);
//        }
//    }
//
//    public static void main(String[] args) {
//        Demo d1 = new Demo();
//        Demo d2 = new Demo();
//
//        d1.start();
//        d2.start();
//    }

    public void run(){
        try {
            //t1.join();
            for (int i = 1; i <=5; i++){
                System.out.println("Thread: "+i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        t1= Thread.currentThread();
        Demo d = new Demo();
        Demo d1 = new Demo();
        System.out.println("NAME OF THREAD: "+d.getName());
        d.setName("Rahulbhai");
        System.out.println("change the name: "+d.getName());
        System.out.println("the priority of d is: "+d.getPriority());
        System.out.println("the priority of d1 is: "+d1.getPriority());
        System.out.println(Thread.currentThread().getName());
        System.out.println("the priority of main thread is: "+Thread.currentThread().getPriority());

        d.start();
        d.join();
        d1.start();

        try {
            for(int i = 0 ; i <=5; i++){
                System.out.println("main thread: "+i);
                Thread.sleep(1000);

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
