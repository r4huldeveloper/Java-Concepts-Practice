
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// USING INHERITANCE EXTEND FRAME
public class awt extends Frame implements ActionListener {
    TextField tf1,tf2,tf3;

    Label l1,l2,l3;

    Button b1,b2,b3,b4;

    // CONSTRUCTOR
    awt(){

        // Write the Label and set the color
        l1 = new Label("Enter the 1st number");
        l1.setBounds(10,50,120,30);
        l1.setForeground(Color.blue);
        l1.setBackground(Color.PINK);

        l2  = new Label("Enter the 2nd number");
        l2.setBounds(10,90,120,30);
        l2.setForeground(Color.blue);
        l2.setBackground(Color.PINK);


        l3 = new Label("Your Answer is");
        l3.setBounds(10,130,120,30);
        l3.setBackground(Color.PINK);
        l3.setForeground(Color.blue);



        // HERE ITS TEXT FIELD WHERE WE WRITE VALUE FOR CALCULATION
        tf1 = new TextField();
        tf1.setBounds(140,50,100,30);

        tf2 = new TextField();
        tf2.setBounds(140,90,100,30);

        tf3 = new TextField();
        tf3.setBounds(140,130,100,30);

        // HERE I CREATED BUTTONS FOR PERFORM ARITHMETIC OPERATIONS
        b1 = new Button("+");
        b1.setBounds(70,190,50,35);

        b2 = new Button("-");
        b2.setBounds(130,190,50,35);

        b3 = new Button("*");
        b3.setBounds(190,190,50,35);

        b4 = new Button("/");

        b4.setBounds(250,190,50,35);

        // ADD THE ACTION LISTENER TO THE BUTTONS
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);


        // ADD ALL THE COMPONENTS IN THE FRAME
        add(l1);
        add(l2);
        add(l3);
        add(tf1);
        add(tf2);
        add(tf3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);



        // SPECIFICATIONS FOR FRAME
        setBackground(Color.YELLOW);
        setSize(500,500);
        setLayout(null);
        setVisible(true);

    }

    // MAKE THE METHOD OF ACTION LISTENER
    public void actionPerformed(ActionEvent e){
        String s1= tf1.getText();
        String s2  = tf2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        if (e.getSource() == b1){
            c = a + b;
        } else if (e.getSource()==b2)
        {
             c = a - b;
        } else if(e.getSource() == b3) {
            c = a * b;
        } else if(e.getSource() == b4){
            c =  a / b;
        }
        String result = String.valueOf(c);
        tf3.setText(result);
    }

    // MAKE THE MAIN METHOD
    public static void main(String[] args) {
        new awt();
    }
}
