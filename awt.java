import org.w3c.dom.Text;

import java.awt.*;

// USING INHERITANCE EXTEND FRAME
public class awt extends Frame {
    awt(){
        // creating a label
        Label nameLbl = new Label("Enter your name");
        Label ageLbl = new Label("Enter your age");
        // creating a TextField to write the name
        TextField nameField = new TextField();
        TextField ageText = new TextField();

        //setting the bounds of nameLbl and text field
        nameLbl.setBounds(10,50,100,25);
        nameLbl.setBackground(Color.BLACK);
        nameLbl.setForeground(Color.yellow);

        nameField.setBounds(110,50,120,22);
        ageText.setBounds(110,80,120,22);

        // set bound for age label
        ageLbl.setBounds(10,80,85,25);
        ageLbl.setForeground(Color.yellow);
        ageLbl.setBackground(Color.BLACK);

        // adding the components in the frame

        add(nameLbl);add(nameField);add(ageLbl);add(ageText);

        // setting the layout manager null and visible true and frame size
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setBackground(Color.black);

    }
    public static void main(String[] args) {
        awt hi = new awt();

    }
}
