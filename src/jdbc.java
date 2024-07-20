
import java.sql.*;
public class jdbc{

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//bu proje iicn mysql connector jar i indirip  projeye ekledik 
String url="jdbc:mysql://localhost:3306/jdbc";
String uname="root";
String pass="root";
int iduser=5;
String usern="serpil";



String query="insert into users(idusers,username) values("+iduser+" ,'"+usern+"')";

Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con=DriverManager.getConnection(url,uname,pass);
        Statement st=con.createStatement();
        int count =st.executeUpdate(query);
System.out.println(count+" .data added");

        st.close();
        con.close();
    }
}
