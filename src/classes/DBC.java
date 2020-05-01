/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//0000000000000000000
package classes;

/**
 *
 * @author Sam
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class DBC {
    public static Connection getConnection()
    {
        Connection con=null;
             
        try
        {
           String DBPwd="";
           String DBUN="";
           String DBDriver="sun.jdbc.odbc.JdbcOdbcDriver";
           String DBSource="jdbc:odbc:HRDB"; 
           Class.forName(DBDriver);
                con=DriverManager.getConnection(DBSource,DBUN,DBPwd);
        }
        catch(Exception e)
        {
            System.out.println("Exception in getting connection"+e);
             
        }
        return con;
    }
    public static void main(String a[])
    {
        DBC.getConnection();
    }
}

