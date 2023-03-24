import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IPfinder extends JFrame implements ActionListener {
    JTextField tf; JLabel lbl; JButton btn;

    IPfinder(){
        tf = new JTextField();
        tf.setBounds(50,50,150,20);

        lbl = new JLabel();
        lbl.setBounds(50,100,250,30);

        btn = new JButton("Find IP");
        btn.setBounds(50,160,95,30);
        btn.addActionListener(this);

        add(tf);
        add(lbl);
        add(btn);
        setLayout(null);
        setVisible(true);
        setSize(400,400);
    }

    public void actionPerformed(ActionEvent ex){
        try {
            String host = tf.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            lbl.setText("IP of "+host+" is: "+ip);
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new IPfinder();
    }
}
