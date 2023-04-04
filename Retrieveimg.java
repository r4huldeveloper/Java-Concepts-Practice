import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;

public class Retrieveimg {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
//        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rahul","root","root");

        PreparedStatement ps = con.prepareStatement("SELECT * from imgtable");

        ResultSet rs = ps.executeQuery();
        if (rs.next()){
            Blob blob = rs.getBlob(2);
            byte[] bytes = blob.getBytes(1, (int) blob.length());

            FileOutputStream fout = new FileOutputStream("C:\\Users\\Lenovo\\rahul.jpg");
            fout.write(bytes);
            fout.close();
        }
        System.out.println("File sent to the folder");


    }
}
