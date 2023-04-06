package Threading;

 class Sync{

   synchronized void printTable(int n){
        for(int i = 1; i <= 5; i++ ){
            System.out.println(n*i);
        }
        try{
            Thread.sleep(1000);
        } catch(Exception e){
            e.printStackTrace();
        }
    } 
}

 class Thread1 extends Thread{
    Sync s1;
    Thread1(Sync s1){
        this.s1 = s1;
    }
   public void run(){
        s1.printTable(5);
    }
}

class Thread2 extends Thread{

    Sync s1;

    Thread2(Sync s1){
        this.s1 = s1;
    }
    public void run(){
        s1.printTable(2);
    }
}

class Test{
    public static void main(String[] args) {
        Sync sync =  new Sync(); // only one object
        Thread1 t1 = new Thread1(sync);
        Thread2 t2  = new Thread2(sync);


        t1.start();
        t2.start();
    }
}
