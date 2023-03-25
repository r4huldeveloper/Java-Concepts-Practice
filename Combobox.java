package ComboBox;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Combobox extends JFrame {
    Combobox(){
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400,100);
        String[] lang = {"JAVA","PHP","PYTHON","C++","RUST"};
        final JComboBox c = new JComboBox(lang);
        c.setBounds(40,90,100,40);

        JButton btn = new JButton("Show");
        btn.setBounds(180,90,90,25);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String cp = "Programming name selected: "+c.getItemAt(c.getSelectedIndex());
                label.setText(cp);
            }
        });
        add(label);add(c);
        add(btn);
        setLayout(null);
        setVisible(true);
        setSize(500,500);
    }

    public static void main(String[] args) {
        new Combobox();
    }
}
