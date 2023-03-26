import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame {

    JMenuItem i1,i2,i3,i4;JMenuItem cut,copy,paste;
    JMenu menu, edit, help;
    JFrame frm,frm2;
    JEditorPane ed;

    Main(){

        frm = new JFrame("Notepad Program");
        JMenuBar mb = new JMenuBar();

        menu = new JMenu("Menu");

        i1 = new JMenuItem("Item1");
        i2 = new JMenuItem("Item2");
        i3 = new JMenuItem("Item3");
        i4 = new JMenuItem("Item4");
        menu.add(i1);menu.add(i2);menu.add(i3);menu.add(i4);

        edit = new JMenu("Edit");
        cut = new JMenuItem("Cut");
        //cut.addActionListener(this);
        copy = new JMenuItem("Copy");
        //copy.addActionListener(this);
        paste = new JMenuItem("Paste");
        //paste.addActionListener(this);
        edit.add(cut); edit.add(copy); edit.add(paste);

        help = new JMenu("Help");

        ed = new JEditorPane();
        ed.setBounds(2,1,500,500);
        frm.add(ed);


        mb.add(menu);
        mb.add(edit);
        mb.add(help);
        frm.setJMenuBar(mb);

        frm.setLayout(null);
        frm.setVisible(true);
        frm.setSize(500,500);

    }


    public static void main(String[] args) {
        new Main();
    }
}
