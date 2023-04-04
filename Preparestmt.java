import java.sql.*;

public class Preparestmt {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rahul","root","root");
//        PreparedStatement psmt = con.prepareStatement("insert into emp values(?,?,?)");
//       psmt.setInt(1,1);
//       psmt.setString(2,"Rahul");
//       psmt.setInt(3,20);
//        int i = psmt.executeUpdate();
//        System.out.println(i + " rows affected");

        PreparedStatement smt = con.prepareStatement("update emp set name=?, age=? where id=?");
        smt.setString(1,"Lovi");
        smt.setInt(2,21);
        smt.setInt(3,1);
        int i   =smt.executeUpdate();
        System.out.println(i+" rows affected");


        PreparedStatement ps = con.prepareStatement("SELECT * from emp");
        ResultSet res = ps.executeQuery();
        while (res.next()){
            System.out.println(res.getString(2)+" "+res.getInt(3));
        }

        PreparedStatement deletesmt = con.prepareStatement("DELETE from emp where id=?");
        deletesmt.setInt(1,1);
        int j = deletesmt.executeUpdate();
        System.out.println(j+" rows affected");
        con.close();
    }
}
