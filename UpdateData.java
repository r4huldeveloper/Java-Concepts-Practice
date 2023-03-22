package com.jdbc.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateData {
    public static void main(String[] args) {
        try {
            Connection connection = ConnectionProvider.getConnection();
            String q = "update table1 set tname=? , tcity=? where tid=?";
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter new name: ");
            String name = br.readLine();

            System.out.println("Enter city name: ");
            String city = br.readLine();

            System.out.println("Enter the student id: ");
            int id = Integer.parseInt(br.readLine());

            PreparedStatement psm = connection.prepareStatement(q);
            psm.setString(1,name);
            psm.setString(2,city);
            psm.setInt(3,id);

            psm.executeUpdate();
            System.out.println("done...");
            connection.close();


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
