import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextArea extends JFrame implements ActionListener {
    JTextArea area;JLabel l1,l2;JButton button;

    TextArea(){
        l1 = new JLabel();
        l1.setBounds(50,25,120,35);
        l2 = new JLabel();
        l2.setBounds(110,25,110,35);
        area = new JTextArea();
        area.setBounds(20,80,300,300);
        button = new JButton("Count Words");
        button.setBounds(80,400,110,30);
        button.addActionListener(this);

        add(l1);add(l2);add(area);add(button);
        setLayout(null);
        setVisible(true);
        setSize(500,500);
    }

    public void actionPerformed(ActionEvent e){
        String text = area.getText();
        String[] words = text.split("\\s");
        l1.setText("Words: "+words.length);
        l2.setText("Characters: "+text.length());
    }

    public static void main(String[] args) {
        new TextArea();
    }
}
