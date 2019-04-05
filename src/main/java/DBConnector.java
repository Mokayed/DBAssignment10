
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hallur
 */
public class DBConnector {

    public void connect(String url, String userName, String password) {
        try {
            Connection con = DriverManager.getConnection(
                    url, userName, password);
            
            Statement stmt = con.createStatement();
           
            stmt.execute("create schema fuck;");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
