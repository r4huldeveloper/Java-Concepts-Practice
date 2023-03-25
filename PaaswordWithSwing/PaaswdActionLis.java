import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.PasswordAuthentication;

public class PaaswdActionLis extends JFrame implements ActionListener {
    JLabel usr,pass,usrName,usrPass; JPasswordField passwd;
    JTextField enterName,enterPass;
    JButton login ;
    PaaswdActionLis(){
      usrName = new JLabel("Enter Your Name:");
      usrName.setBounds(30,40,150,30);
      enterName = new JTextField();
      enterName.setBounds(140,45,180,25);

      usrPass= new JLabel("Enter the Paasword:");
      usrPass.setBounds(30,105,190,30);
      enterPass = new JTextField();
      passwd = new JPasswordField();
      passwd.setBounds(150,105,150,25);


      login = new JButton("Login");
      login.setBounds(140,160,80,30);
      login.addActionListener(this);

      usr = new JLabel();
      usr.setBounds(10,200,400,30);

      pass = new JLabel();
      pass.setBounds(10,220,400,30);

      add(usrName); add(enterName); add(usrPass); add(enterPass); add(login); add(usr); add(pass); add(passwd);
      setSize(400,400);
      setLayout(null);
      setVisible(true);


    }

    public void actionPerformed(ActionEvent e){
        String name = enterName.getText();
        usr.setText("Your Name is: "+name);
        String key = String.valueOf(passwd.getPassword());
        pass.setText("Your Password is: "+key);

    }

    public static void main(String[] args) {
        new PaaswdActionLis();
    }
}


