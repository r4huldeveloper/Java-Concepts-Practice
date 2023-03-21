import java.util.concurrent.Callable;

public class Constructors {
    String number;
    int i;
    String name;

    // OVERLOADING CONSTRUCTOR
    Constructors(int i, String name){
        this.i = i;
        this.name = name;
    }

    Constructors(int i, String name, String number){
        this.i = i;
        this.name = name;
        this.number = number;
    }

    // COPY THE CONSTRUCTOR
    Constructors(Constructors s){
        i = s.i;
        name = s.name;
    }

    // DISPLAY THE OBJECT
    void display(){
        System.out.println(i+" "+name+" ");
    }

    public static void main(String[] args) {
        Constructors constructors = new Constructors(15,"Rahul");
        Constructors constructors1 = new Constructors(20,"Rahul");
        Constructors constructors2 = new Constructors(constructors);
        constructors2.display();


//        Constructors constructors2 = new Constructors(22,"hi","99XXXXX00");
//        constructors.display();
//        constructors1.display();
//        constructors2.display();
    }
}
