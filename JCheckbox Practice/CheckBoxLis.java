import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class CheckBoxLis extends JFrame {
    JLabel lbl; JCheckBox chk1; JCheckBox chk2;

    CheckBoxLis() {
        lbl = new JLabel();
        lbl.setBounds(50, 20, 201, 30);

        chk1 = new JCheckBox("Rahul is good boy");
        chk1.setBounds(30, 80, 190, 30);
        chk1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                lbl.setText("1st checkbox: "+ (e.getStateChange() == 1 ? "1st checked":"unchecked"));
            }
        });


        chk2 = new JCheckBox("Rahul is a Learner");
        chk2.setBounds(30, 120, 190, 30);
        chk2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                lbl.setText("2nd Checkbox: "+(e.getStateChange()==1 ? "2nd checked" : "unchecked"));
            }
        });

        add(lbl);add(chk1);add(chk2);
        setLayout(null);
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxLis();
    }
}
