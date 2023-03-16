public class App {
    public void finalize(){System.out.println("object is garbage collected");}
    public static void main(String[] args) throws Exception {
       App gApp = new App();
       App hApp = new App();
       gApp = null;
       hApp = null;

       System.gc();
    }
}
