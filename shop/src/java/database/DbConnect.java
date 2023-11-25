/*
Satish Aryan Zindabad
*/
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import oracle.jdbc.OracleDriver;

/**
 *
 * Author = Amitabh Bachchan
 */
public class DbConnect {
public static Connection connect()
{
    try
    {
        String user="satish",url="jdbc:oracle:thin:@localhost:1521:xe",password="pass";
        DriverManager.registerDriver(new OracleDriver());
        return DriverManager.getConnection(url, user, password);
    }
    catch(Exception ex)
    {
        System.out.println(ex);
        return null;
    }
}
}