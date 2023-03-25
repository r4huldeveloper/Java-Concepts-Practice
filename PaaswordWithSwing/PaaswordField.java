import javax.swing.*;

public class PaaswordField extends JFrame {

    JPasswordField passwd; JLabel lbl; JTextField tx;

    PaaswordField(){
        passwd = new JPasswordField();
        tx = new JTextField();
//        tx.setBounds(110,50,100,30);
        lbl = new JLabel("Enter the Password:");
        lbl.setBounds(30,50,120,30);
        passwd.setBounds(150,50,100,30);

        add(lbl); add(passwd); add(tx);
        setVisible(true);
        setLayout(null);
        setSize(400,400);
    }

    public static void main(String[] args) {
        new PaaswordField();
    }

}
