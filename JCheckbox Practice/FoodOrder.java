import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrder extends JFrame implements ActionListener
{
  private JLabel lbl; private JCheckBox ch1,ch2,ch3; private JButton bt;

    FoodOrder(){
        lbl = new JLabel("Food Ordering System");
        lbl.setBounds(30,30,130,30);

        ch1 = new JCheckBox("Pizza RS.100");
        ch1.setBounds(50,90,130,30);

        ch2 = new JCheckBox("Burger RS.30");
        ch2.setBounds(50,140,130,30);

        ch3 = new JCheckBox("Tea RS.10");
        ch3.setBounds(50,190,130,30);

        bt = new JButton("Order");
        bt.setBounds(110,280,120,35);
        bt.addActionListener(this);

        add(lbl);
        add(ch1);
        add(ch2);
        add(ch3);
        add(bt);

        setLayout(null);
        setVisible(true);
        setSize(400,400);
        setTitle("Food Ordering");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e){
        float amount = 0;
        String msg="";
        if (ch1.isSelected()) { amount += 100;  msg += "Pizza: 100\n";}
        if (ch2.isSelected()) { amount  += 30;  msg += "Burger: 30\n";}
        if (ch3.isSelected()) { amount  += 10;  msg += "Tea: 10\n";}
        msg += "------------------\n";
        JOptionPane.showMessageDialog(this,msg+"Total: "+amount);
    }

    public static void main(String[] args) {
        new FoodOrder();
    }
}
