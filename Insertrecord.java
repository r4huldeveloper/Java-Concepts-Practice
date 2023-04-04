import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class Insertrecord {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rahul","root","root");

        PreparedStatement psm = con.prepareStatement("INSERT into emp values(?,?,?)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("Enter id");
            int id = Integer.parseInt(br.readLine());
            System.out.println("Enter name");
            String name = br.readLine();
            System.out.println("Enter age: ");
            int age = Integer.parseInt(br.readLine());

            psm.setInt(1,id);
            psm.setString(2,name);
            psm.setInt(3,age);

            int i = psm.executeUpdate();
            System.out.println(i+" rows affected");
            System.out.println("Do you want to continue: y/n");
            String s = br.readLine();
            if (s.startsWith("n")){break;}

        }
        while (true);

        PreparedStatement psmt = con.prepareStatement("SELECT * from emp");
        ResultSet resultSet = psmt.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3));
        }

        con.close();

    }
}
