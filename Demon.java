public class Demon extends  Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("daemon thread work");
        }
        else
        {
            System.out.println("user thread work");
        }
    }

    public static void main(String[] args) {
        Demon d = new Demon();

        Demon d1 = new Demon();
        d.setDaemon(true);
        d.start();

        d1.start();
    }
}
