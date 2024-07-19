
import java.sql.*;
public class jdbc{

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

String url="jdbc:mysql://localhost:3306/jdbc";
String uname="root";
String pass="root";

String query="select * from users where userAge=38";
        Class.forName("com.mysql.jdbc.Driver");

        Connection con=DriverManager.getConnection(url,uname,pass);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        rs.next();
        String age=rs.getString(3);
        System.out.println(age);
        st.close();
        rs.close();
    }
}
