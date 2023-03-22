import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class imgInDB {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","root");
            String q = "insert into images(pic) values(?)";
            PreparedStatement pst = con.prepareStatement(q);
            FileInputStream fs = new FileInputStream("C:\\Users\\Lenovo\\Downloads\\OIP.jpg");
            pst.setBinaryStream(1,fs,fs.available());
            pst.executeUpdate();
            System.out.println("done...");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
