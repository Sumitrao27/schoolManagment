
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class NewClass {
   public static void main(String[] args) throws Exception {
   
        try{
            Class.forName("com.mysql.jdbc.Driver");
         String url_d="jdbc:mysql://localhost:3306/model";
         String root="root";
         String password="01282324168";
            try (Connection con = DriverManager.getConnection(url_d,root,password)) {
                Statement st=con.createStatement();
                String query="Select * from student";
                ResultSet rs=st.executeQuery(query);
                rs.next();
                String c1=rs.getString(1);
                String c2=rs.getString(2);
                System.out.println(c1);
                System.out.println(c2);
                rs.close();
                st.close();
            }
        }
catch(SQLException e){
System.out.println("SQL exception is caught "+e);
}
    }
    
}
