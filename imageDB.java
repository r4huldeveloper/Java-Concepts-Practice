import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class imageDB {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","root");

            String q = "insert into images(pic) value(?)";
            PreparedStatement pst = con.prepareStatement(q);
            //pst.setString();
            FileInputStream file = new FileInputStream("");
            pst.setBinaryStream(1,);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
