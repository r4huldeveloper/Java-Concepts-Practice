package com.jdbc.practice;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {
        try {

            Connection c = ConnectionProvider.getConnection();
            String q = "insert into images(pic) values(?)";

            PreparedStatement pmt = c.prepareStatement(q);
            JFileChooser jf = new JFileChooser();
            jf.showOpenDialog(null);
            File file = jf.getSelectedFile();
            FileInputStream fis = new FileInputStream(file);

            pmt.setBinaryStream(1,fis,fis.available());

            pmt.executeUpdate();

            System.out.println("done");


            JOptionPane.showMessageDialog(null,"success");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
