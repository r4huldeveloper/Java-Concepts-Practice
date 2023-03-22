import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.*;
import java.sql.Statement;

public class jdbc {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String username = "root";
        String password = "root";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);

            // CREATE A QUERY
//            String q = "create table table1(tid int(20) primary key auto_increment , tname varchar(200) not null , tcity varchar(400))";

            // Create statement
//            Statement stmt = connection.createStatement();
//            stmt.executeUpdate(q);
//            System.out.println("Table created in database...");

            // create a query
            String q = "insert into table1(tname,tcity) value(?,?)";
            // get the prepared statement object
            PreparedStatement pstmt=connection.prepareStatement(q);

            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter name: ");
            String name = bf.readLine();
            System.out.println("Enter city: ");
            String city = bf.readLine();

            // set the value to the query
            pstmt.setString(1,name);
            pstmt.setString(2,city);

            pstmt.executeUpdate();

            System.out.println("data inserted..");
            connection.close();


//            if (connection.isClosed()){
//                System.out.println("connection is closed");
//            } else {
//                System.out.println("connection created..");
//            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
