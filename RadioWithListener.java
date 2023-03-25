import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioWithListener extends JFrame implements ActionListener {

    JRadioButton r1 , r2; JButton button;
    RadioWithListener(){

        r1 = new JRadioButton("1) Male");
        r1.setBounds(30,50,120,40);



        r2 = new JRadioButton("2) Female",false);
        r2.setBounds(30,100,120,40);


        button = new JButton("Click me");
        button.setBounds(85,150,100,35);
        button.addActionListener(this);


        add(r1);add(r2);add(button);


        setLayout(null);
        setSize(400,400);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        if (r1.isSelected()){
            JOptionPane.showMessageDialog(this,"You are a boy");
        }
        if (r2.isSelected()){
            JOptionPane.showMessageDialog(this,"You are Female");
        }
    }



    public static void main(String[] args) {
        new RadioWithListener();
    }
}
