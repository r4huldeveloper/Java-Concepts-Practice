import javax.swing.*;

public class TableExample {
    JFrame f;
    TableExample(){
        f = new JFrame();
        String[][] data = {
                {"101","Rahul","50,000"},
                {"105","Lovi","80,000"},
                {"110","Yufi","100,000"}
        };
        String[] column = {"ID","NAME","SALARY"};

        JTable jt = new JTable(data,column);

        jt.setBounds(30,100,200,300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);

        f.setSize(400,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TableExample();
    }
}
