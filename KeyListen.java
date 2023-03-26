import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListen extends Frame  {
    TextArea area;
    Label label;

    KeyListen(){
        // creating the label
        label = new Label();
        label.setBounds(30,50,150,30);

        area = new TextArea();
        area.setBounds(20,100,290,290);
        area.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                label.setText("Key Typed");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                label.setText("Key Pressed");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                label.setText("Key released");
            }
        });
        add(label);add(area);
        setLayout(null);
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new KeyListen();
    }
 }
