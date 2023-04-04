import com.mysql.cj.jdbc.Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insertimg {
    public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rahul","root","root");

        PreparedStatement psm = con.prepareStatement("INSERT into imgtable values(?,?)");
        psm.setString(1,"Rahul");

        FileInputStream fs = new FileInputStream("C:\\Users\\Lenovo\\OneDrive\\Desktop\\IMG20230313003516.jpg");
        psm.setBinaryStream(2,fs,fs.available());
        int i =  psm.executeUpdate();
        System.out.println(i+" rows affected");
    }
}
