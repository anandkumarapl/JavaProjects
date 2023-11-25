package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Message {
    public static String getChat() {
        try {
            String output = "<center>\n<table class=\" shadow-lg table table-striped table-hover \" border='1'>\n";
            output += "<tr><th>msgfrom </th><th>msgto </th>\n<th>message </th></tr>\n";
            PreparedStatement ps = DbConnect.connect().prepareStatement("select * from message");
                        ResultSet rs = ps.executeQuery();
            int count = 1;
            while (rs.next()) {
               
                String msgfrom = "" + rs.getObject("msgfrom");
                String msgto = "" + rs.getObject("msgto");
                 String message = "" + rs.getObject("message");
           
                output += "<tr><td>" + count + " </td><td>" + msgfrom + " </td><td>" + msgto + " </td><td>" + message + " </td><td></center></a></td></tr>\n";

                count++;
            }
            output += "</table>\n</center>\n";
            return output;

        } catch (Exception ex) {
            System.out.println(ex);
            return "";
        }}
}