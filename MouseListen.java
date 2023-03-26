import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseListen extends Frame {
    MouseListen() {

        Label lbl = new Label();
        lbl.setBounds(30,35,120,30);
        add(lbl);

        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                lbl.setText("X: "+e.getX()+" Y: "+e.getY());
                Graphics g = getGraphics();
                g.setColor(Color.PINK);
                g.fillOval(e.getX(),e.getY(),10,20);
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });
        setLayout(null);
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseListen();
    }

}