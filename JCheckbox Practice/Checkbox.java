import javax.swing.*;
import java.awt.*;

public class Checkbox extends JFrame {
    JCheckBox checkBox;
    Checkbox(){
        checkBox = new JCheckBox("Java");
        checkBox.setBounds(20,30,100,20);
        add(checkBox);
        setLayout(null);
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Checkbox();
    }
}
